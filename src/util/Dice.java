package util;
import java.util.Vector;
import java.util.Iterator;

public class Dice {

	private int diceType;
	private int numOfDice;
	private int result;
	
	public static int quickRoll(int rolls, int sides){
		int value= 0;
		for (int x=0; x<rolls; x++){
			RandomNumberGenerator.randomInt(1, sides);
			value = value + RandomNumberGenerator.randomInt(1, sides);
		}
		return value;
	}
	
	public void roll(int rolls, int sides){
		diceType = sides;
		numOfDice=rolls;
		
		int value= 0;
		for (int x=0; x<numOfDice; x++){
			RandomNumberGenerator.randomInt(1, diceType);
			value = value + RandomNumberGenerator.randomInt(1, diceType);
		}
		result = value;
	}

	public int result(){
		
		return result;
	}
	public static int rollsVector(Vector Rolls){
		int total=0;
//		Also, maybe another method that takes a vector of Roll objects and
//		returns the total of the entire set AND populates the results
//		individually.  That call would look like:
		//get an Iterator object for Vector using iterator() method.
	    //DEBUG System.out.println("Rolls in vector: " + Rolls.size());
	    
	    //LEARN: I was going to use an iterator but the methods for Iterator seem limited
	    //LEARN: Such as while i am going through the iterator I want to know what element I am at...
	    //I guess I could set up a counter....
	    Iterator itr = Rolls.iterator();
	    int counter = 0;
	    while (itr.hasNext()){
	    	counter++;
	    	//LEARN: Why can't 'this' be used in a static class
	    	//LEARN: never really got my head around 'this'...
	    	//LEARN; think i found the explanation
	    	//System.out.println("The result of roll" + counter +" is: " + this.result());
	    	Dice currentElement = (Dice) itr.next();
	    	//DEBUG System.out.println("The value of roll" + counter + " in the vector is: " + currentElement.result());
	    	total += currentElement.result() ;
	    }
		
		return total;
	}
}
