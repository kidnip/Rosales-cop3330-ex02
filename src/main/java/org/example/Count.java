package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rosales Jeremy
 */
public class Count
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        Word myWord = new Word(); //

        System.out.print( "What is the input string?" ); //prompt for input
        String theWord = input.next();
        myWord.setName(theWord);
        System.out.printf("%s%s%d%s", myWord.getName(), " has ", theWord.length(), " characters.");

    }
}
