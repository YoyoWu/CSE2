///////////////
//Yulun Wu
//CSE 002  SEC 110
//Due 9/23/14
//
//Write a program that has the user enter an positive integer giving the number of seconds
//that have passed during the day and then displays the time in conventional form.
//(The problem here is displaying time with "padded" 0s, e.g., 10:03:05). 

import java.util.Scanner;               //import statement

//define a class
public class TimePadding {
    //add a method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);          //Scanner Constructor
		int numSeconds = -1;                            //define the number of seconds
		
		do {                                                //do while loop 
			System.out.println("Enter the time in seconds : ");
			while (!scan1.hasNextInt()) {                      //make sure its an integer
	        scan1.next();			
			System.out.println("You did not enter an int");	
			}
			
			numSeconds = scan1.nextInt();                   //accept user input
			if ((numSeconds < 0) || (numSeconds > 86400 ))  //conditions when number is not within 0 to 86400
			  System.out.println("The number was outside the range [0,86400]");	

			
		} while ((numSeconds < 0) || (numSeconds > 86400));
		
		int hours = numSeconds / 3600;              //define hours by seconds
		int	remainder = numSeconds % 3600;          //find the remainder
		int minutes = remainder / 60;               //calculate minutes 
		int	seconds = remainder % 60;               //calculate seconds
		
	
		System.out.println("The time is " + String.format("%02d",hours)  + ":" + String.format("%02d",minutes) + ":" + String.format("%02d",seconds));
		
	}//end method  

}//end class
