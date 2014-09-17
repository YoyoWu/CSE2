//////////////////////////////////////////////////////////////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
//9/16/14
//
//
//Program #2
//Write a program that prompts the user to enter a double 
//and then prints out a crude estimate of the cube root of the number
//and the value of this crude guess when cubed.

import java.util.Scanner;                       //import statement 

//define a class
public class Root{
    
    //main method
    public static void main(String[] args){
        //auto generated method 
        
        Scanner  myScanner;                     //declare an instance for Scanner project
        myScanner = new Scanner (System.in);    //scanner constructor
        
        double x;                               //define the number entered
        
    
        
        System.out.println("Enter a double and I will print the cube root: ");
        x = myScanner.nextDouble();      //accepted user input
        
        double guess = (double)x/3;            //make a guess
        
        //(iterative alogrithm) for loops
        for (int i=0; i<5; i++){                //run the loop five times. 0,1,2,3,4.
                                    
            guess = (2*guess*guess*guess+x)/(3*guess*guess);   //trying to get guess
        }
        
        System.out.println("The cube root is "+guess);         //print out result 
        System.out.println(guess+"*"+guess+"*"+guess+"="+guess*guess*guess);
        }//end method
        
    }   //end class