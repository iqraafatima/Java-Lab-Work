/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Arrays;
public class LexicographicalSortingCode  {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] arr = new String[3];
System.out.println("Enter three strings:");
for (int i = 0; i < 3; i++) {
arr[i] = sc.nextLine();
}
Arrays.sort(arr);
System.out.println("Sorted Strings:");
for (String str : arr) {
System.out.print(str + " ");
}}}
