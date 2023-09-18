import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static double inputNumber() {
        Scanner in = new Scanner(System.in);
        double value = 0;
        while (true) {
            try {
                double nr = in.nextDouble();
                if (nr > 0) {
                    value = nr;
                    break;
                }
                else {
                    System.out.println("Input can't be negative, try again...");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Must be a number");
                in.nextLine();
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nSALARY AND INVOICE PROGRAM");
        System.out.println("\n1. Pay salary to employees" +
                           "\n2. Create a new invoice" +
                           "\n3. Pay one or more invoices");
        System.out.print("Enter: ");
        String choice = input.nextLine();

        switch (choice) {
            case "1": {
                System.out.println("How many employees do you want to pay salary for?");
                int nrOfEmployees = (int)inputNumber();
                break;
            }
            case "2": {
                break;
            }
            case "3": {
                break;
            }
            default:
                System.out.println("Please choose from the menu...");
        }
    }
}