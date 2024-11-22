import java.util.Scanner;

public class TheaterProfitCalculator {

    public static double calculateTotalProfit(int attendees) {
        final double ticketPrice = 5.0; 
        final double fixedCost = 20.0; 
        final double costPerAttendee = 0.50; 

        double income = attendees * ticketPrice;
        double totalCost = fixedCost + (attendees * costPerAttendee);

        return income - totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = scanner.nextInt();

        double totalProfit = calculateTotalProfit(attendees);
        System.out.println("Total Profit for the show: $" + totalProfit);
    }
}
