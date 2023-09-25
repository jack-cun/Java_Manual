package org.example;

import java.util.Scanner;  // Import the Scanner class


public class Main
{
    /**
     * @author Giacomo Cunardi
     *
     * @param args it is ....
     */
    public static void main(String[] args)
    {

        //// PRIMITIVE VARIABLES ////

        boolean b = false;  // Declare a boolean variable b
        byte b1 = 0;  // Declare a byte variable b1
        short s = 0;  // Declare a short variable s
        int n = 0;  // Declare an integer variable n
        long l = 0;  // Declare a long variable l
        float f = 0;  // Declare a float variable f
        double d = 0;  // Declare a double variable d

        char c = 'a';  // Declare a character variable c
        String s1 = "Ciao";  // Declare a string variable s1

        //// INPUT AND OUTPUT ////

        Scanner Name = new Scanner(System.in);  // Create a new scanner object

        System.out.println("Inserisci il nome: ");  // Print the name

        b = Name.nextBoolean();
        b1 = Name.nextByte();
        s = Name.nextShort();
        n = Name.nextInt();
        l = Name.nextLong();
        f = Name.nextFloat();
        d = Name.nextDouble();
        s1 = Name.nextLine();

        //// MATH OPERATIONS ////


        Math.abs(n);  // Compute the absolute value of n
        Math.sqrt(n);  // Compute the square root of n
        Math.pow(n, 2);  // Compute the square of n
        Math.cos(n);  // Compute the cosine of n
        Math.sin(n);  // Compute the sine of n
        d = Math.PI;  // Compute the value of PI

        //// SWITCH CASES ////

        switch (c)
        {
            case 'a':
                System.out.println("a");
                break; //MUST
            case 'b':
                System.out.println("b");
                break; //MUST
            case 'c':
                System.out.println("c");
                break; //MUST

        }

        //// ARRAYS ////

        int[] j = new int[10];  // Create an array of 10 integers

        System.out.println(j.length); // Print the length of the array j

        int[][] j2 = new int[10][20];  // Create an array of 10 rows and 20 columns

        //// STRING FUNCTIONS ////

        String s2 = "Ciao";  // Create a string variable s2
        String s3 = "ciao";  // Create a string variable s3
        boolean risultato;
        int x;
        char y;

        risultato = s2.equals(s3);  // Compare the strings s2 and s3
        risultato = s2.equalsIgnoreCase(s3);  // Compare the strings s2 and
        x = s2.length();
        y = s2.charAt(7); // Get the character at index 7
        risultato = s2.startsWith("C");  // Check if the string s2 starts
        risultato = s2.endsWith("a");  // Check if the string s2 ends
        risultato = s2.contains("a");  // Check if the string s2 contains
        risultato = s2.isEmpty();  // Check if the string s2 is empty
        s1 = s2.trim(); // Trim the string s2 (delete the spaces the beginning and the end)
        s1 = s2.replace("a", "b");  // Replace the first occurrence of the string "a" by "b"

        ////// WRAPPER CLASSES ////

        Boolean b2 = true;  // Create a boolean variable b2
        Character c2 = 'a';  // Create a character variable c2
        Integer i2 = 10;  // Create an integer variable i2
        Double d2 = 10.0;  // Create a double variable d2

        boolean b3 = false;  // Create a boolean variable b3

        b2.compareTo(b3);  // Compare the boolean variables b2 and b3
        i2.toString();  // Convert the integer variable i2 to a string

        //// ARRAY LIST ////


        ArrayList<String> lista = new ArrayList<String>();  // Create an array list of strings

        lista.add("Ciao");  // Add the string "Ciao" to the array list
        lista.get(0);  // Get the first element of the array list
        lista.set(0, "Ciao");  // Set the first element of the array list to ""
    }
}