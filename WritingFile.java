/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.io.*;

public class WritingFile {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Izzat Ali\\Downloads\\input.txt"));

        bw.write("Hello World");
        bw.newLine();
        bw.write("Java File Handling");

        bw.close();
    }
}
