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

        double account = 25000;

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
                double[] employeeArray = new double[nrOfEmployees];
                System.out.println("Enter salary for every employee.");
                for (int i = 0; i < employeeArray.length; i++) {
                    System.out.print("Employee " + (i+1) + ": ");
                    employeeArray[i] = inputNumber();
                }
                System.out.println("\nSALAIES");
                for (int i = 0; i < employeeArray.length; i++) {
                    System.out.println("Employee " + (i+1) + " salary is " + (employeeArray[i] * 0.7) +
                                       " kr after 30% tax.");
                }
                break;
            }
            case "2": {
                System.out.print("Enter the amount of the invoice: ");
                double invoice = inputNumber();
                double vat = (invoice * 0.25);
                account += invoice;
                System.out.println("Gross amount: " + invoice + " kr.");
                System.out.println("VAT: " + vat + " kr.");
                System.out.println("Net sum: " + (invoice - vat) + " kr.");
                System.out.println("Current sum on bank account: " + account + " kr.");
                break;
            }
            case "3": {
                System.out.print("Enter numbers of invoices to pay: ");
                int invoiceNr = (int)inputNumber();
                double[] invoiceArray = new double[invoiceNr];
                double invoiceTotal = 0;
                for (int i = 0; i < invoiceArray.length; i++) {
                    System.out.print("Enter the amount for invoice " + (i+1) + ": ");
                    invoiceArray[i] = inputNumber();
                    invoiceTotal += invoiceArray[i];

                }
                System.out.println("Total sum of invoices: " + invoiceTotal + " kr.");
                if (invoiceTotal > account) {
                    System.out.println("Sorry, you don't have enough money to pay. You are "
                            + (account - invoiceTotal) + " kr short.");
                }
                else {
                    System.out.println("You have " + (account - invoiceTotal) + " kr left on account after the " +
                            "invoices are payed.");
                }
                break;
            }
            default:
                System.out.println("Please choose from the menu...");
        }
    }
}