/////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
//9/12/14
//Write a Program that computes the cost of buying a some BigMacs.
//

import java.util.Scanner;           //import statement 

//Define a Class
public class BigMac{
    
    //main method
    public static void main (String[] args){
        Scanner myScanner;  //declare an instance of Scanner Object
        myScanner = new Scanner (System.in); //Scanner Constructor
        System.out.print(
           "Enter the number of Big Macs (an integer > 0);");
           int nBigMacs = myScanner.nextInt();  //accept user input
           
        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx):");
        double bigMac$ = myScanner.nextDouble();
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;        //user enters percent, but I want proportion
        
        double cost$;        //declare variables
        int dollars;         //whole dollar amount of cost
        int dimes;
        int pennies;        //for storing digits to the right of the decimal point for the cost$
            
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        dollars = (int)cost$;               //initialize dollars
        //get the whole amount, dropping decimal fraction dollars = (int) cost$;
        //get dimes amoung,e.g.,
        //(int)(6.73*10) % 10  -> 67 %10 -> 7
        //where the %(mod) operator returns the remainder
        //after the division: 583%100 -> 83, 27%5 ->2
        
        
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of "+ nBigMacs+" BigMacs, at $"+
        bigMac$+" per bigMac, with a "+" sales of tax of "+(int)(taxRate*100)+
        "%, is $"+dollars+'.'+dimes+pennies);
        
        
        
        
    }//end of main method
}//end of class