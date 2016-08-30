/*
 * Handle ArrayIndexOutOfBounds Exception. 
 * For example if array is having only 5 elements and we are trying to display 7th element then it should throw exception.
 */

package com.session5.ass3ExceptionHandling1;

public class MyExceptionHand1 {
	public static void main(String[] arg){
		int myArray[] = new int [6];
		try{
			for (int i=0;i<myArray.length;i++){
				myArray[i]=i;
				System.out.println(myArray[i]);
			}
			System.out.println(myArray[7]);
		}
			catch (IndexOutOfBoundsException e){
			System.err.println("Caught Array IndexOutOfBoundsException: "+ e.getMessage());
			}
		}
	}
