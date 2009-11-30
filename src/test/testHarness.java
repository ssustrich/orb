package test;

import engine.gamePlay.*;
import java.util.Vector;

import util.Dice;


public class testHarness {

	/**
	 * @param args
	 */
	public  static void main(String[] args) {

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
		
		System.out.println("***");
		Encounter.test();
	}
}
