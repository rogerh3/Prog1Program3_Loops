//Project: Project 3 - Loops
//Author: Roger H Hayden III
//Desc: Using Loops and counting down
//Version: 1.0
//Last Updated: 9/18

import java.util.Scanner;

public class IntLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in); 
		//Inputing scanner
		
		System.out.println("Hello, what is your name?");
		String name = keyboard.next();
		 
		System.out.println("Hello " + name + " please pick an integer that is equlivalent to or between 1 and 100." );
		int number = keyboard.nextInt(); 
		//requesting an integer
			while (number < 1 || number > 100) {
				System.out.println("Number is invalid, please pick another number.");
					number = keyboard.nextInt(); 
			}
	    // telling someone if they did not enter a valid number to re enter one that is valid
		
			if (number >= 1 || number <= 100);
				System.out.println("Thank you for your input " + name); 
		// saying thank you for the input 
		//for the number as long as it is greater than 0 and less than or equal to 100 it counts down.		
			System.out.println("Begin count down for lift off....");
			for (int x = number; x <= 100 && x >= 0 ; x--) {
				if (x % 2 == 0)
				System.out.print(x + " AH" + " ");
				else 
					System.out.print(x + " OH" + " ");
				}
			//Above I added Ah's and Oh's in between every iteration
			//I wasn't really sure what to put in between them
			//I guess this could be people making those noises in amazement or happiness
			//Or it could be people being scare at what could happen at then end
			}

}
