//////////////////////////////////
//Yulun Wu
//CSE 002  SEC 110
//hw05 
//
//Write a program that has three boolean variables 
//to each of which the value of true or false is randomly assigned. 
//Then, at random, combine the three variables with random choices of && and || and stores the result. 
//For example, one might have the expression true && false || true (there are 32 possible expressions,
//so I will not list all the possibilities). 

import java.util.Random;  					//import statement for random class
import java.util.Scanner;					//import statement for Scanner class

//define a class
public class BoolaBoola {
	//add a method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		boolean bool1 = true;					//Randomly generated variable 1
		boolean bool2 = true;					//Randomly generated variable 2	
		boolean bool3 = true;					//Randomly generated variable 3
		boolean userInput = true;				//user input
		
		
		boolean op1;							//randomly generated operator 1
		boolean op2;							//randomly generated operator 2
				
		Random random = new Random();			// random class
		
		bool1 = random.nextBoolean();	
		bool2 = random.nextBoolean();
		bool3 = random.nextBoolean();
		
		
		op1 = random.nextBoolean();
		op2 = random.nextBoolean();
		String opString1 = null;
		String opString2 = null;
		
		if (op1)								//convert op booleans to string
		  opString1 = "&&";						//two options: "and""or"
		else
		  opString1 = "||";
		if(op2)
			opString2 = "&&";
		else 
			opString2 = "||";
		
		System.out.println("Does " + bool1+"  " + opString1+"  " +bool2+"  "+opString2+"  " +bool3+" have the value true(t/T) or false(f/F)?");
			
		Scanner myScanner = new Scanner(System.in);			//Scanner input 
		char ch = myScanner.next().charAt(0);				//search for the letter at position 0.
		
		if ((ch == 'T') || (ch == 't')) {					//if user typed in "t" or "T"
			userInput = true;
		}
		
		if ((ch == 'F') || (ch == 'f')) {					//if user type in "f" of "F"
			userInput = false;
		}
		
		boolean evaluation1 = true;							//variable boolean "true" or "false" for evaluation first two booleans.
		boolean evaluationFinal;							//variable  for the result of first two and the third one.
		
		if (op1)											//evaluate with "and" operator
		
		  evaluation1 = bool1 && bool2;
		
		else 
			
		  evaluation1 = bool1 || bool2;						//evaluate with "or" operator
		
		if (op2)

		  evaluationFinal = evaluation1 && bool3;			//repeat with the evaluation1 and third boolean randomly generated
		
		else
			
		  evaluationFinal = evaluation1 || bool3;
		
		if (evaluationFinal == userInput) {
			
			System.out.println("Correct!");
			
		} else {
			System.out.println("Wrong!Please try again.");					//default print out
		}
		
		
		
	}//end method

}//end class
