import java.util.Scanner;

public class Main {
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