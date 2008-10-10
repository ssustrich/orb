package engine.util;
import java.math.*;
import java.util.Random;


public class RandomNumberGenerator {

	public int randomInt(int Max){
		Random iRandom = new Random();
		int randint = iRandom.nextInt(Max);
		return randint;
	}
	
	public static int randomInt(int Min, int Max){
		Random iRandom = new Random();
		int randint = iRandom.nextInt(Max)+Min;
		return randint;
	}
	
	public int randomInt(){
		Random iRandom = new Random();
		int randint = iRandom.nextInt();
		return randint;
	}
	
	public boolean randomBoolean(){
		Random bRandom = new Random();
		return bRandom.nextBoolean();
	}
	
}
