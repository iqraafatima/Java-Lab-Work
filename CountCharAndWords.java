/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.io.*;
public class CountCharAndWords {



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Izzat Ali\\Downloads\\input.txt"));

        int[] charCount = new int[256]; // for characters

        String[] words = new String[1000];
        int[] wordCount = new int[1000];
        int size = 0;

        String line;

        while ((line = br.readLine()) != null) {

            // character count
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                charCount[c]++;
            }

            // word count
            String[] arr = line.split("\\s+");

            for (int i = 0; i < arr.length; i++) {
                String w = arr[i];
                int found = -1;

                // check if word already exists
                for (int j = 0; j < size; j++) {
                    if (words[j].equals(w)) {
                        found = j;
                        break;
                    }
                }

                if (found == -1) {
                    words[size] = w;
                    wordCount[size] = 1;
                    size++;
                } else {
                    wordCount[found]++;
                }
            }
        }

        br.close();

        // print characters
        System.out.println("Character count:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 0) {
                System.out.println((char)i + " -> " + charCount[i]);
            }
        }

        // print words
        System.out.println("Word count:");
        for (int i = 0; i < size; i++) {
            System.out.println(words[i] + " -> " + wordCount[i]);
        }
    }
}