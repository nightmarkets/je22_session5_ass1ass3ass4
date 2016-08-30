/*Handle NumberFormat Exception. 
 * For example the statement int num=Integer.parseInt ("XYZ"); 
 * would throw NumberFormatException because String XYZ cannot be parsed to int. So handle it.
 * 
 */
package com.session5.ass4ExceptionHandling2;

public class MyExceptionHand2 {
public static void main(String[] arg){
	int number;
	String myString = "test";
	try {
		int myNumber = Integer.parseInt(myString);
	}
	catch (NumberFormatException e){
	System.err.println("Caught exception: "+ e.getMessage());	
	}
}
}
