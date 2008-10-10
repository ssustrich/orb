package test;

import engine.util.*;
import engine.util.Dice.*;
import engine.gamePlay.*;
import java.util.Vector;

public class testHarness {

	/**
	 * @param args
	 */
	public  static void main(String[] args) {
		Dice r1 = new Dice();
		r1.roll(3, 6);
		//Roll r2 = new Roll( 4, 10);
		Vector<Dice> v = new Vector<Dice>();
		v.add(r1);
		//v.add(r2);
		int total = Dice.roll(v);
		System.out.println(total);
		System.out.println(v);
		System.out.println(r1.roll(3, 6));
		//System.out.println(r2);
		

		System.out.println("***");
		Encounter.test();
	}
}
