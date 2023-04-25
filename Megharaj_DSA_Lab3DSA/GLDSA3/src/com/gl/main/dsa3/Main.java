package com.gl.main.dsa3;

import java.util.Scanner;

// extends the abstract class BalancedBrackets and implements the isBalanced method.

public class Main extends com.gl.GerenateBrackets.DSA3.BalancedBrackets {

//The main method prompts the user to enter a string containing 
//brackets and checks whether the string has balanced brackets or not using the isBalanced method.	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string containing brackets: ");
		String inputString = sc.nextLine();
		if (isBalanced(inputString)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		sc.close();
	}
}