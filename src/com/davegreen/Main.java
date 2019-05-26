package com.davegreen;

public class Main
{
    public static void main(String[] args)
    {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore == 50)
        {
            System.out.println("This is an expression");
        }

        int score = 100; // This is an expression but only (score = 100), not the data type or semi-colon.
        if (score > 99) // This is a condition or parameter, but the statement within the brackets is also an expression.
        {
            System.out.println("You got the high score"); // The contents of the brackets are an expression.

            score = 0; // This is an expression, except for the semi-colon.
        }
    }
}
