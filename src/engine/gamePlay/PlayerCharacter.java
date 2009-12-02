package engine.gamePlay;

import java.util.*;
import java.io.*;

public class PlayerCharacter {
	private String charName;
	private HashMap charAttributes; //basic 6 attributes
	private int charHP; //character hit points
	private int charGold;  //character gold
	private String charRace;
	private String charClass;
	//private Class;
	//private enum Race;
	//private static int armorLevel;  //armor rating
	//at some point we'll have to look at how to handle an inventory
	//private something inv;
	//same for armor, weapon, etc

	//character constructor
	public PlayerCharacter(){
		
	}
	
	
	//method to create a character
	/*LEARN: the createCharatcer method as I envisioned it most certainly shouldn't be
	 * in this method also since right now I'm using getters and setters it wouldn't have been
	 * needed here anyway. It's more tied with the gui and as part of MVC it should be separate
	 * from this class anyway
	 */
	public PlayerCharacter createCharacter(){
		return null;
	}


	/*LEARN:So two articles one in java world in particular say that getters and setters are bad?
	 * When did this happen? What's the new paradigm? Why is it better? How would it be used here?
	 * I was never stuck on getters and setters anyway but I'm sure their is a reason they were good
	 * at one time, and now a equally good reason they fell out of favor
	 * I should read and start to understand the article:
	 * article in question http://www.javaworld.com/javaworld/jw-09-2003/jw-0905-toolbox.html
	 */
	public String getCharName(){
		return charName;
	}

	public void setCharName(String sName){
		charName = sName;
	}	
	
	public int getHP(){
		return charHP;
	}
	
	public void setHP(int hpChange){
		charHP += hpChange;
		if (charHP == 0)
		{
			//make call to character is dead or something
		}
	}

	public int getGold(){
		return charGold;
	}
	
	public void setGold(int goldChange){
		charGold += goldChange;
		if (charGold < 0)
			charGold = 0;
	}
}
