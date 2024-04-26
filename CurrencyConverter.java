import java.util.*;
class CurrencyConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double InrToEur = 0.011;
        double InrToGbp = 0.0096;
        double InrToUsd = 0.012;

        System.out.println("Enter the amount in Rupees:");
        double amountINRs = sc.nextDouble();

        double amountEUR = amountINRs * InrToEur;
        double amountGBP = amountINRs * InrToGbp;
        double amountINR = amountINRs * InrToUsd;
        
        System.out.println(amountINRs + " Rs is equal to " + amountEUR + " EUR");
        System.out.println(amountINRs + " Rs is equal to " + amountGBP + " GBP");
        System.out.println(amountINRs + " Rs is equal to " + amountINR + " INR");
    }
}
