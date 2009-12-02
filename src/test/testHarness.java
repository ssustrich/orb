package test;

import engine.gamePlay.*;
import util.UserInputReader;
import util.ConfigReader;
//import engine.gamePlay.PlayerCharacter;

import java.util.Vector;

import util.Dice;


public class testHarness {

	/**
	 * @param args
	 */
	public  static void main(String[] args) {

		System.out.println("***Begin Dice Test***");
		//roll the dice two times
		System.out.println("Quickroll 1 :" + Dice.quickRoll(3,6));
		System.out.println("Quickroll 2 :" + Dice.quickRoll(3,6));
		
		
		//creates two roll objects
		Dice roll1 = new Dice();
		Dice roll2 = new Dice();
		
		//does the actual rolls
		roll1.roll(3, 6);
		roll2.roll(3, 6);
		//print out value of roll1 and roll2
		System.out.println("value of the first roll is: "+ roll1.result());
		System.out.println("value of the second roll is: "+ roll2.result());
		
		//add the rolls to a vector of rolls
		//LEARN: what is the difference/benefit between the the old .add and the new .addElement?
		Vector<Dice> v = new Vector<Dice>();
		v.addElement(roll1);
		v.add(roll2);		
		System.out.println("The total value in the vector is: " + Dice.rollsVector(v));
		System.out.println("***End Dice Test***");
		System.out.println();
		System.out.println();
		
		System.out.println("***Begin Encounter Test***");
		Encounter.test();
		System.out.println("***End Encounter Test***");
		System.out.println();
		System.out.println();

		System.out.println("***Begin PlayerCharacter Gen***");
		PlayerCharacter test = new PlayerCharacter();
		test.setCharName(UserInputReader.readString("Enter a string"));
		test.setGold(UserInputReader.readInt("Enter an int (or anything else to test number format exception)"));
		System.out.println(test.getCharName()+" has " + test.getGold() + " gold pieces");
		System.out.println("Work now on reading character base config info and mod it");
		ConfigReader charConfigTest = new ConfigReader();
		charConfigTest.parseXmlFile("xml/characterConfig.xml");
		charConfigTest.parseDocument("*");
		charConfigTest.printData();
		System.out.println("***End PlayerCharacter Gen***");
		System.out.println();
		System.out.println();
	
	}
}
