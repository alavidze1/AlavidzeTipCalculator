import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome! How many people are in your group?");
        int numPeople = scan.nextInt();
        System.out.print("And what is the tip percentage?");
        int tipPercent = scan.nextInt();

        System.out.println("Please enter the prices of the items you're ordering, type -1 when you've entered them all.");
        double totalCost=0;
        double tempCost=0;
        double nextItem=scan.nextDouble();
        scan.nextLine();
        while(nextItem>=0){
            tempCost+=((double)((int)((nextItem+0.005)*100)))/100;
            totalCost=totalCost+tempCost;
            System.out.println("Tempcost: "+ tempCost);
            nextItem=scan.nextDouble();
            scan.nextLine();
            tempCost=0;
            System.out.println("Totalcost: "+ totalCost);
            totalCost+=((double)((int)((totalCost+0.005)*100)))/100;
        }






        scan.close();
    }
}