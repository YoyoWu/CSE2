/////////////////////////////////
//Yulun Wu
//CSE 002 Sec 110
//Due 9/8/2014
//
//Write a program that calculates the total cost of items I bought at Walmart including 6% tax.
//total cost of each kind of item; sales tax for that total cost
//Total cost of purchases (before tax)
//Total actually paid for this transaction, including sales tax


//define a class
public class Arithmetic{
    
//main method 
    public static void main (String[ ] args){
        
    //input variables
    int nSocks = 3;                 //Number of pairs of socks
    double sockCost$ = 2.58;       //Cost per pair of socks
    
    int nGlasses = 6;               //Number of drinking glasses
    double glassCost$ = 2.29;       //Cost per glass
    
    int nEnvelopes = 1;             //Number of boxes of envelopes
    double envelopeCost$ = 3.25;    //Cost per box of envelopes
    
    double taxPercent = 0.06;       //Penn tax percentage
    
    System.out.println( nSocks + " pairs of socks were bought, and each pair costs "+ sockCost$ + " dollars.");
    System.out.println( nGlasses + " drinking glasses were bought, and each costs "+ glassCost$ + " dollars.");
    System.out.println( nEnvelopes + " envelopes were bought, and each costs "+ envelopeCost$ + " dollars.");
    
    double totalSockCost$;          //total cost of socks variable
    double totalGlassCost$;         //total cost of glasses variable
    double totalEnvelopeCost$;      //total cost of envelopes variable
    
    double taxSocks$;               //tax for all socks 
    double taxGlasses$;             //tax for all drinking glasses
    double taxEnvelopes$;           //tax for all envelopes 
    
    totalSockCost$ = nSocks*sockCost$;              //calculate total cost of socks
    totalGlassCost$ = nGlasses*glassCost$;          //calculate total cost of glasses
    totalEnvelopeCost$ = nEnvelopes*envelopeCost$;     //calculate total cost of enveloeps
    
    taxSocks$ = totalSockCost$*taxPercent;          //Calculate tax for socks
    taxGlasses$ = totalGlassCost$*taxPercent;       //Calculate tax for glasses
    taxEnvelopes$ = totalEnvelopeCost$*taxPercent;  //Calculate tax for envelopes
    
    
    
    System.out.println("The total cost for socks is $"+ totalSockCost$ +". The tax for socks is $"+ (int) (taxSocks$*100)/(100.0)+".");
    System.out.println("The total cost for glasses is $"+ totalGlassCost$ +". The tax for glasses is $"+ (int) (taxGlasses$*100)/(100.0)+".");
    System.out.println("The total cost for taxEnvelopes is $"+ totalEnvelopeCost$ +". The tax for envelopes is $" + (int) (taxEnvelopes$*100)/(100.0)+".");
    
    
    double totalCost;               //Total cost for all three items
    double totalTax;                //Total sales tax
    double megaTotal;               //Total cost for the transaction
    
    totalCost = totalSockCost$+totalGlassCost$+totalEnvelopeCost$;       //Calculate total cost of three items
    totalTax = taxSocks$+taxGlasses$+taxEnvelopes$;                      //Calculate total tax
    megaTotal = totalCost+totalTax;                                      //Calculate the cost for the whole transaction
    System.out.println("The total cost of all itesm is "+totalCost+ " dollars.");
    System.out.println("The total tax for all items is "+(int) (totalTax*100)/(100.0)+" dollars.");
    System.out.println("The total cost inluding tax is "+ (int) (megaTotal*100)/(100.0)+" dollars."); 
    
    
    }
    

}