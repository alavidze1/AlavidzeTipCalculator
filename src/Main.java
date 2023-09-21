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
        while(scan.nextDouble()>0){
            totalCost+=scan.nextDouble();
        }






        scan.close();
    }
}