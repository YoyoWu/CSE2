//////////////////////////////////
//Yulun Wu
//CSE 002  SEC 110
//Due 9/23/14
//
// Write a program that prompts the user to enter an int that
//gives the thousands of dollars of income 
//and then writes out the amount of tax on the income. 
// Make certain the user enters an integer and that the integer is greater than or equal to 0.
//Given the folowing schedule: <20, 5%; 
//  >=20 and <40, 7%; 
//  >=40 and <78, 12%;
//  >=78, 14%;
import java.util.Scanner;                   //import statement

//define class
public class IncomeTax {
    //add a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);         //Scanner Constructor
		int income;                                     //define income
		do {                                            //do while loop 
			System.out.println("Enter an int giving the number of thousands : ");
			while (!scan1.hasNextInt()) {               //make sure it is an integer
	        scan1.next();			
			System.out.println("You did not enter an int");	
			}
			
			income = scan1.nextInt();   
			if (income < 0)                             //conditions when it is a negative
			  System.out.println("You did not enter a positive int");	
		} while (income < 0);
		
		double rate = 0.0;                              
			
		if (income  < 20) {                         //when income is less than 20 thousands and greater than 0
			rate = 5.0;
		} else if ((income >= 20) && (income < 40)) {       //when income is greater than 20 thousands and less than 40 thds. 
			rate = 7.0;                                     //tax is 7%
		} else if ((income >= 40) && (income < 78)) {       //when income is greater than 40 thousands and less than 78 thds
			rate = 12.0;                                   //tax is 12%
		} else if (income >= 78) {                         //when income is greater than 78 thousands
		   rate = 14.0;                                     //tax is 14%
		}
			
		System.out.println("The tax rate on $" + income + "000 is " + rate + "%, and the tax is $" + String.format("%.2f",income * 1000 * (rate/100))  );
	}	//end method

	

}//end class
