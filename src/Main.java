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
        while(nextItem>=0){
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
        System.out.println("Total Percentage: " + tipPercent + "%" );
        double totalTip = (totalCost/100)*tipPercent;
        System.out.println("Total Tip: $" + totalTip);
        double totalBill = totalCost + totalTip;
        System.out.println("Total Bill with tip: $" + totalBill);
        double perPersonBeforeTip = totalCost/numPeople;






        scan.close();
    }
}