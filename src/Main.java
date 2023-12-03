// Java dla żyjących


package com.inherito.test.cipher;

public class Main {

    public static void main(String[] args) {




        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(sb);
        int index = str.length();                                                         //number of characters
        System.out.println(index + " Characters");


        char[] letter = str.toCharArray();                                               //transform of array
        char[] letter2 = new char[index];
        int [] table = new int[index];


        for (int i = 0; i < index; i++){                                                //coding part
            table[i] = (int)letter[i];                                                  //char to ASCII
            table[i] = table[i]* 2 -1;                                                  // x = x * 2 - 1
            System.out.print((char)table[i]);                                           // taka dekoracja ładna
        }

        System.out.println("I dekodowanie");

        for (int i = 0; i < index; i++){                                                // decoding part
            letter2[i] = (char)((table[i]+1)/2);                                        // x = ( x +1 ) / 2
            System.out.print(letter2[i]);
        }
    }
}
