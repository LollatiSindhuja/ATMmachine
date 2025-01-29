//ATM program 
import java.util.*;
public class ATM {
    //account balance of the users
    static double bankBalance = 30000.00; 
    //ATM pin of the users
    static String atmPin = "8484";      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Exit = false;
        System.out.println("Welcome to SBI ATM");
        while (!Exit) {
            //main menu
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Cash Withdrawal");
            System.out.println("2. Change ATM PIN");
            System.out.println("3. Check Bank Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    withdrawl(sc);
                    break;
                case 2:
                    changeAtmPin(sc);
                    break;
                case 3:
                    checkBankBalance();
                    break;
                case 4:
                    System.out.println("Thank you!!!");
                    Exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
    static void withdrawl(Scanner sc) {
        //asking for the withdrawal amount
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= bankBalance) {
            bankBalance -= amount;
            System.out.println("Transaction successful,Please collect your cash.");
            //updating the current bank balance
            System.out.println("Remaining balance: " + bankBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    static void changeAtmPin(Scanner sc) {
        //check the users pin is correct or not
        System.out.print("Enter your current PIN: ");
        String currentPin = sc.next();
        //take the new pin 
        if (currentPin.equals(atmPin)) {
            System.out.print("Enter your new PIN: ");
            String newPin = sc.next();
            atmPin = newPin;  
            //changing the pin and updating
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect PIN");
        }
    }
    //checking the bank balance
    static void checkBankBalance() {
        System.out.println("Your current bank balance is: " + bankBalance);
    }
}
