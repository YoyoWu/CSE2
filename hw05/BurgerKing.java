//////////////////////////////////
//Yulun Wu
//CSE 002  SEC 110
//hw05 
//
//Now Burger King gets its chance. Write a program that prompts the user 
//to enter a choice of a burger, a soda, or fries. 
//Then the program prompts the users for details of their choices. 


import java.util.Scanner;				//import statement

//define a class
public class BurgerKing {
	
	//add a method
	public static void main(String[] args) {
		
	Scanner myScanner = new Scanner(System.in);				//Scanner Constructor
		// TODO Auto-generated method stub
	System.out.println("Enter a letter to indicate a choice of ");
        System.out.println("Burger (B or b)");  
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        
       
        String s = myScanner.next();				//user input as String
        char choice = s.charAt(0);				//Selecting the letter
        
        switch(choice){
        case 'b': case 'B':					//b or B means user wants Burger
        	System.out.println("Enter A or a for 'all the fixins', C or c for cheese,  "
        			+ "N or n for none of the above c");
        	char fixin = myScanner.next ().charAt(0);
        	switch(fixin){
        	case 'A': case 'a':				//A or a means ALL
        	System.out.println("You ordered a burger with all fixins.");
        	break;
        	case 'C': case 'c':				//C or c means cheese
        	System.out.println("You ordered a burger with cheese.");
        	break;
        	case 'N': case 'n':				//N or n for None
        	System.out.println("You ordered a burger with no fixins.");
        	}
        break;
        case 's': case 'S':					//S or s means user wants Soda
        	System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
        	char soda = myScanner.next().charAt(0);
        	switch(soda){
        	case 'P': case 'p':				//P or p for Pepsi
        		System.out.println("You ordered a Pepsi.");
        		break;
        	case 'C': case 'c':				//C or c for Coke
        		System.out.println("You ordered a Coke.");
        		break;
        	case 'S': case 's':				//S or s for Sprite
        		System.out.println("You ordered a Sprite.");
        		break;
        	case 'M': case 'm':				//M or m for Mountain Dew
        		System.out.println("You ordered a Mountain Dew.");
        		break;
        	}
        break;
        
        case 'f': case 'F':					//F or f means user wants Fries
        	System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
        	char fries = myScanner.next().charAt(0);
        	switch(fries){
        	case 'S': case 's':				//S or s means samll size
        		System.out.println("You ordered Small fries.");
        		break;
        	case 'L': case 'l':				//L or l means large size
        		System.out.println("You ordered Large fries.");
        		break;
        	}
        break;

        default:
        System.out.println("You did not enter any of B, b, S, s, F, or f ");			//if not any of the cases listed above
        break;
        }
        
        
        
        }//end method
        	
}//end class
