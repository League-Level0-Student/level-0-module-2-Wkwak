//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You have a great dog");
		}
		
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are admired by many");
		}
		
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are very tall relative to an apple");
		}
		
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are intelligent");
		}
		
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are the best person to ever walk this earth!");
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
