package util;

import java.util.*;
import java.io.*;


public class UserInputReader {

private static String stringInput = null;
private static int intInput = 0;
private static String Input = null;
private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//read string with no prompt to user
	private static String readInput(){
		try {
			Input = br.readLine();
			}
		catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}
		return Input;
	}

	//read string with prompt
	public static String readString(String prompt){ 
		System.out.print(prompt+": ");
		stringInput = readInput();
		return stringInput; 
	}
	
	//read string with no prompt to user
	public static String readString(){
		stringInput = readInput();
		return stringInput; 
	}

	//read int with prompt
	public static int readInt(String prompt){
		System.out.print(prompt+": ");
		stringInput = readInput();
		try{
			intInput = Integer.parseInt(stringInput);
		}
		catch (NumberFormatException ex) {
		      System.err.println("Not a valid number: " + stringInput);
		}
		return intInput; 		
	}
	
	//read int without user prompt
	public static int readInt(){
		System.out.println();
		stringInput = readInput();
		try{
			intInput = Integer.parseInt(stringInput);
		}
		catch (NumberFormatException ex) {
		      System.err.println("Not a valid number: " + stringInput);
		}
		return intInput; 		
	}	
}