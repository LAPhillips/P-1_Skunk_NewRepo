package skunk.domain;
import edu.princeton.cs.introcs.*;

public class SkunkApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Skunk");
		int [] array = {1, 2, 3, 4};
		Dice skunkDice = new Dice();
	
		
		//standard dice is random
		skunkDice.roll();
		System.out.println(skunkDice.toString());
		
		//dice with an array uses a pre-entered sequence
		skunkDice.roll(array);
		System.out.println(skunkDice.toString());

		//dice with an array uses just one number per die
		skunkDice.roll(7, 2);
		System.out.println(skunkDice.toString());

	}

}
