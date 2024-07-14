package assessment;

import java.util.Scanner;

interface Companies {
    // Default method to calculate profit (CP - SP)
    default double calculateProfit(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }

    // Static method to get company name based on profit
    static String getCompanyName(double profit) {
        if (profit >= 0) {
            return "Profitable Company";
        } else {
            return "Loss-making Company";
        }
    }

    // Abstract method to get company details
    String getCompDetails(double profit, String name);
}

public class ProfitLossOfCompany {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        // Example usage:
    	System.out.println("Enter Cost Price: ");
        double costPrice = sc.nextDouble();
        System.out.println("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();

        // Using lambda expression to implement getCompDetails
        Companies company = (profit, name) -> {
            String companyName = Companies.getCompanyName(profit);
            return "Company Name: " + name + ", Profit/Loss: " + profit + ", Type: " + companyName;
        };

        // Calculating profit using default method
        double profit = company.calculateProfit(costPrice, sellingPrice);

        // Getting company details using implemented lambda expression
        String compDetails = company.getCompDetails(profit, "Sample Company");

        // Outputting the result
        System.out.println("Profit: " + profit);
        System.out.println(compDetails);
    }
}
