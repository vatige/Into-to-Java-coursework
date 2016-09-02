package com.wesring.tipcalculator;

import java.util.Scanner;

public class TipCalculatorMain {
	public static void main(String[] args){
		//Formatting
		System.out.println("-------Tip Calculator-----");
		System.out.println("What was the meal cost?");
		System.out.print(">");
		
		Scanner input = new Scanner(System.in);//Making a scanner
		System.out.println("Your bill with 15% tip is $" + (input.nextDouble() * 1.15));//Actual input and math
		
		input.close();//Properly closing the scanner
		System.out.println("---------Good Bye---------");
	}
}
