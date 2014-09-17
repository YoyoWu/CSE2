//////////////////////////////////////////////////////////////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
//9/13/14
//
//
//Program #1 
//Write a program that prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer
//and the second giving the number of seconds during which the counts occurred
//and  then prints out the distance traveled and average miles per hour. 
//Assume diameter of wheel = 27 in.

import java.util.Scanner;               //import statement

//define a class
public class Bicycle{

//main method
    public static void main (String[] args){
        
        Scanner myScanner;                      //declare an instance for Scanner project
        myScanner = new Scanner (System.in);    //Scanner Constructor
        
        System.out.print(
            "Enter the number of seconds (int) : ");
            int nSeconds = myScanner.nextInt(); //accept user input
        System.out.print(
            "Enter the number of counts (int): ");
            int nCounts = myScanner.nextInt();  //accept user input
        
        double distance;                        //Total distance the person biked.
        double time;                            //Total time the person took
        double mph;                             //average mph
        double wheelDiameter = 27.0,            //define the diameter of the wheel
        PI=3.14159,                             //define pi
        feetPerMile = 5280,                     //define number of feet per mile
        inchesPerFoot = 12,                     //define number of inches per foot
        secondsPerMinute = 60,                  //define number of seconds per minute
        minutesPerHour = 60;                    //define number of minutes per hour
        
        
        distance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;  //Calculate the total distance
        time = nSeconds/secondsPerMinute;                               //Calculate the total time
        mph= distance/time/minutesPerHour;                              //Calculate the average mph
        
        System.out.println("The distance was "+ (int) (distance*100)/(100.0) + " miles and took "+ 
        (int)(time*100)/(100.0) + " minutes.");                         //convert into two decimals and print. 
        System.out.println("The average mph was "+ mph+ ".");   
    }//end of main method
    
}//end of class