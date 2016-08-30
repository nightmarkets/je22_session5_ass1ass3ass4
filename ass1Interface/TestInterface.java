/*
 * Defining an interface and its implementation in two different classes in different way. 
 * Define an interface having one method that takes an integer parameter. 
 * For this method, provide two implementations: 
 * In the first one, just print the value
 * and in the second one, print the square of the number. 
 * Try to call both the versions.
 */

package com.session5.ass1Interface;

public class TestInterface {
	public static void main(String[] arg){
		int myNumber = 10;
		PrintNumber pn = new PrintNumber();
		PrintSquareNumber psn = new PrintSquareNumber();

		pn.myPrint(myNumber);
		psn.myPrint(myNumber);
	}
}
