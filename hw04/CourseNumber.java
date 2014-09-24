///////////////
//Yulun Wu
//CSE 002  SEC 110
//Due 9/23/14
//
//The semester during which a course is offered at Lehigh is given by a 6 digit number/
//The first four digits give the year, and the last two digits give the semester:
//10 spring, 20 summer 1, 30 summer 2, and 40 fall. 
//Write a program that reads in a 6 digit number, makes sure that it adheres to the above description, 
//and then prints out the semester and year
// 
import java.util.Scanner;                           //import statement

//define a class
public class CourseNumber {
    //add a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);         //scanner constructor
		int courseNumber = 0;                           //define initial coursenumber

		do {                                          //start do while loop
			System.out.println("Enter a six digit number giving the course semester : ");
			while (!scan1.hasNextInt()) {                   //make sure its an int
	        scan1.next();			
			System.out.println("You did not enter an int");	
			}
			
			courseNumber = scan1.nextInt();             //accept user input
			if ((courseNumber < 186510) || (courseNumber > 201440))         //make sure the int is within the range 
			  System.out.println("The number was outside the range [186510,201440]");	

			
		} while ((courseNumber < 186510) || (courseNumber > 201440));       
		
		int semester = courseNumber % 100;      //find semester
		int year = courseNumber / 100;          //find year
		
		switch (semester) {
		 case 10 :                      //last two digits end with 10
		   System.out.println("The course was offered in the Spring of semester of " + year);
		   break;	 
		 case 20 :                      //last two digits end with 20
		   System.out.println("The course was offered in the Summer 1 of semester of " + year);
		   break;		 
		 case 30 :                      //last two digits end with 30
		   System.out.println("The course was offered in the Summer 2 of semester of " + year);
		   break;	 
		 case 40 : 	                    //last two digits end with 40
		   System.out.println("The course was offered in the Fall of semester of " + year);
			break;	                    //end of the cases
			 
		 default:                       //set default 
             System.out.println(semester + " is not a legitimate semester");
             break;
		
		
		}
		
		
	}//end method

}//end class
