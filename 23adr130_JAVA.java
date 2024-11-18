import java.util.Scanner;

public class GymMembershipCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BASIC_COST = 20.0;
        final double PREMIUM_COST = 35.0;
        final double PERSONAL_TRAINER_COST = 15.0;
        final double POOL_ACCESS_COST = 10.0;

        System.out.println("Welcome to the Gym Membership Calculator!");
        System.out.print("Enter membership type (Basic or Premium): ");
        String membershipType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter duration (months): ");
        int months = scanner.nextInt();

        System.out.print("Do you want personal trainer access? (yes or no): ");
        boolean personalTrainer = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want pool access? (yes or no): ");
        boolean poolAccess = scanner.next().equalsIgnoreCase("yes");

        double monthlyCost;
        if (membershipType.equals("basic")) {
            monthlyCost = BASIC_COST;
        } else if (membershipType.equals("premium")) {
            monthlyCost = PREMIUM_COST;
        } else {
            System.out.println("Invalid membership type.");
            scanner.close();
            return;
        }

        if (personalTrainer) {
            monthlyCost += PERSONAL_TRAINER_COST;
        }
        if (poolAccess) {
            monthlyCost += POOL_ACCESS_COST;
        }

        double totalCost = monthlyCost * months;
        System.out.printf("Your total cost for %d months is: $%.2f%n", months, totalCost);

        scanner.close();
    }
}
