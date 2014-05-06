package eptingpa;

public class App 
{
    public static void main( String[] args )
    {
    	String input;
    	String output;
        System.out.println( "Enter lower case letters." );
        input = System.console().readLine();
        output = input.toUpperCase();
        System.out.println(output);
    }
}
