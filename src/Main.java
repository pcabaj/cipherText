package com.inherito.test.cipher;

public class Main {

    public static void main(String[] args) {

        String sb = new String("Magiczny tekst do zaszyfrowania");              //constructor
        System.out.println(sb);
        int index = sb.length();                                                         //number of characters
        System.out.println(index + " Characters");


        char[] letter = sb.toCharArray();                                               //transform of array
        char[] letter2 = new char[index];
        int [] table = new int[index];


        for (int i = 0; i < index; i++){                                                //coding part
            table[i] = (int)letter[i];                                                  //char to ASCII
            table[i] = table[i]* 2 -1;                                                  // x = x * 2 - 1
            System.out.print((char)table[i]);
        }

        System.out.println();

        for (int i = 0; i < index; i++){                                                // decoding part
            letter2[i] = (char)((table[i]+1)/2);                                        // x = ( x +1 ) / 2
            System.out.print(letter2[i]);
        }
    }
}
