
import java.util.Vector;

public class Dice {

	public static int roll(int Rolls, int diceType){
		int value= 0;
		for (int x=0; x<Rolls; x++){
			RandomNumberGenerator.randomInt(1, diceType);
			value = value + RandomNumberGenerator.randomInt(1, diceType);
		}
		return value;
	}
	
	public static int roll(Vector Rolls){
//		Also, maybe another method that takes a vector of Roll objects and
//		returns the total of the entire set AND populates the results
//		individually.  That call would look like:
		
		
		return 0;
	}
}
