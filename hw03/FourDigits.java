//////////////////////////////////////////////////////////////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
//9/16/14
//
//Program #3
//Write a program that prompts the user to enter a double
//and then prints out the first four digits to the right of the decimal point. 
//
//

import java.util.Scanner;               //import statement

//define a class.
public class FourDigits{

//main method 
    public static void main (String [] args) {
        Scanner myScanner = new Scanner (System.in);                      //declare an instance
        //myScanner     //state the constructor 
        
        double x = myScanner.nextDouble();      //accept user input
        
        System.out.println("Enter a double and I display the four digits to the right of the decimal point- " + x);
        System.out.println("The four digits are "+ (int)(((int) x)*10000)/10000 + (int)(((int) x)*1000)/1000 + (int)(((int) x)*100)/100
        +(int)(((int) x)*10)/10);
        
    }//end method
}//end class 