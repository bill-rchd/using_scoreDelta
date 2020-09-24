package com.method;

public class Main
{
    public  static int prvScore; // public access variable 1.
    private static int rcnScore; // public access variable 2.

    public static void main(String[] args)
    {
    // Add your variable and call-out.
        prvScore = 4; // define previous score.
        changeScore (1);// define the add score.
        displayScore();
    }

    public static void changeScore( int scoreDelta) // Shortcut.
    {
        rcnScore = prvScore + scoreDelta;
    }
    public static void displayScore()
    {
        System.out.println("Previous Score: " + prvScore);
        System.out.println("Recent Score: " + rcnScore);
    }
}
