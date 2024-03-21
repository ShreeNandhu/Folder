import java.util.Scanner;

class Demostration_112 {
    public static void main(String args[]) {
        double principleAmount = 0.0;
        double rateOfInterest = 0.0;
        int numberOfYears = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter Principle amount:");
            principleAmount = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Enter the rate of Interest:");
            rateOfInterest = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Enter the Number of years:");
            numberOfYears = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return; // Exit the program if invalid input is encountered
        }
        
        double interestTotal = principleAmount * rateOfInterest * numberOfYears;
        System.out.println("Total Interest = " + interestTotal);
        
        scanner.close();
    }
}
