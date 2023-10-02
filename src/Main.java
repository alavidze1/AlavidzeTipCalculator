import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome! How many people are in your group?");
        int numPeople = scan.nextInt();
        System.out.print("And what is the tip percentage?(0-100)");
        int tipPercent = scan.nextInt();
        System.out.println("Please enter the prices of the items you're ordering, type -1 when you've entered them all.");
        double totalCost=0;
        double tempCost=0;
        double nextItem=scan.nextDouble();
        scan.nextLine();
        while(nextItem>=0)
        {
            tempCost=((double)((int)((nextItem+0.005)*100)))/100;
            totalCost=totalCost+tempCost;
            //System.out.println("Tempcost: "+ tempCost);
            tempCost=0;
            totalCost=((double)((int)((totalCost+0.005)*100)))/100;
            //System.out.println("Totalcost: "+ totalCost);
            nextItem=scan.nextDouble();
            scan.nextLine();
        }
        System.out.println("The total cost of your order, before tip, is: $" + totalCost);
        System.out.println("Would you like to sign up for our newsletter for 5% off the total bill?(Y/N)");
        String newsLetter = scan.nextLine();
        if(newsLetter.equals("Y")){
            totalCost = totalCost-(5*(totalCost/100.0));
            totalCost=((double)((int)((totalCost+0.005)*100)))/100;
            System.out.println("Please enter your email:");
            String subscriberEmail = scan.nextLine();
            System.out.println("5% successfully taken off!");
            System.out.println("The updated total cost of your order, is: $" + totalCost);
        }
        else{
            System.out.println("Alright no problem.");
        }
        System.out.println("Total Percentage: " + tipPercent + "%" );
        double totalTip = (totalCost/100)*tipPercent;
        totalTip=((double)((int)((totalTip+0.005)*100)))/100;
        System.out.println("Total Tip: $" + totalTip);
        double totalBill = totalCost + totalTip;
        totalBill=((double)((int)((totalBill+0.005)*100)))/100;
        System.out.println("Total Bill with tip: $" + totalBill);
        double perPersonBeforeTip = totalCost/numPeople;
        perPersonBeforeTip=((double)((int)((perPersonBeforeTip+0.005)*100)))/100;
        System.out.println("Per person cost before tip: $" + perPersonBeforeTip);
        double tipPerPerson = totalTip/numPeople;
        tipPerPerson=((double)((int)((tipPerPerson+0.005)*100)))/100;
        System.out.println("Tip Per Person: $"+ tipPerPerson);
        double costPerPerson = totalBill/numPeople;
        costPerPerson=((double)((int)((costPerPerson+0.005)*100)))/100;
        System.out.println("Cost Per Person: $"+ costPerPerson);
        scan.close();
    }
}
