/////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
///hw01 
//8/29/2014
//
//Given time and rotation count, the program should 
//a.print the number of minutes for each trip
//b.print the number of coutns for each trip
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined

//define a class

public class Cyclometer{

    
//main method
    public static void main(String[ ] args){
        
    //input data
    int secsTrip1=480;              //number of seconds for trip 1
    int secsTrip2=3220;             //number of seconds for trip 2
    int countsTrip1=1561;           //number of counts for trip 1
    int countsTrip2=9037;           //number of counts for trip 2
    
        
    //create variables for constants
    double wheelDiameter=27.0;//the diameter of the wheel
    double PI=3.14159;                 //define Pi
    double feetPerMile=5280;           //define number of feets per mile
    double inchesPerFoot=12;           //define number of inches per foot
    double secondsPerMinute=60;        //define number of seconds per minute
    double distanceTrip1, distanceTrip2, totalDistance;      //variables used in output
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts." );
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
    
//compute values for distance
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //Above gives distance in inches
    //(for each count, a rotation of wheel travels the diameter in inches times PI) 
    
    distanceTrip1/=inchesPerFoot*feetPerMile;                                    //Gives distance in miles for Trip 1
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;      //Gives distance in miles for Trip 2
    totalDistance=distanceTrip1+distanceTrip2;
    
    
    //print out the output data
    System.out.println("Trip 1 was "+ distanceTrip1+" miles");
    System.out.println("Trip 2 was "+ distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }//end of main method
}//end of class