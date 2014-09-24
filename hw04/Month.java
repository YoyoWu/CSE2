//////////////////////////////////
//Yulun Wu
//CSE 002  SEC 110
//Due 9/23/14
//
//Write a program that prompts the user to enter an integer for the month(1 for January, 2 for February) 
//and then displays the number of days in month. 
//If the number 2 is entered  (february) the user is then asked to enter the year. 
//Make sure that the user enters an integer for the month and 
//That the integer is in the required range/
//Similarly, if the year is requested. ensure that an int is entered, and that the int is positive.
import java.util.Scanner;                   //import statement

//define class
public class Month {
    //add a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);             //Scanner constructor
		int month = 0;                                      //set initial month.
		int year = 0;                                       //set initial year.
		
		do {                                              //do-while loop
			System.out.println("Enter an int giving the number of the month (1-12) : ");
			while (!scan1.hasNextInt()) {                             //make sure it is an integer
	        scan1.next();			
			System.out.println("You did not enter an int");	
			}
			
			month = scan1.nextInt();                        //accept user input for month
			if 	((month < 1) || (month > 12))                  //when month is not in the range of 1 to 12
				System.out.println("You did not enter an int between 1 and 12");
		} while ((month < 1) || (month >12));
		
		if (month == 2) {                           //if the month is Febrary.
			
			do {	
			  System.out.println("Enter an int giving the year : ");
			  while (!scan1.hasNextInt()) {                 //make sure the year is an int
			        scan1.next();			
					System.out.println("You did not enter an int");	
					}
					
					year = scan1.nextInt();                 //accept user input
				
			  if (year < 0)                                 //make sure the year is a postive number
				  System.out.println("Year must be positive");
			} while (year < 0);
		}
		
		switch (month) {                                    //month with 31 days in cases
		  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			  System.out.println("The month has 31 days");
			  break;
		  case 4: case 6: case 9: case 11:                      //month with 30 days
			  System.out.println("The month has 30 days");
			  break;
		  case 2:                                                       //if it is Feb. and its a leap year
			  if (((year % 4 == 0) && 
	                     !(year % 100 == 0))
	                     || (year % 400 == 0))
				  System.out.println("The month has 29 days");        
	                else
	              System.out.println("The month has 28 days");        
	                break;
	      default:
	                System.out.println("Month is invalid.");
	                break;
		   
		
		
		}
		
		
	}//end method

}//end class
