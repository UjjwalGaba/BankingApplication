import java.util.Scanner;

public class Account1 {

    // instance variables
    double customerBalance;
    double previousTransaction;

    // creating the constructor of class
    public Account1() {
    }

    // method to check balance
    public void checkBalance() {
        System.out.println("Your total account balance is " + customerBalance + "\n");
    }

    // method for deposit money
    public void deposit(double amountDeposit) {
        if (amountDeposit > 0) {
            customerBalance = customerBalance + amountDeposit;
            System.out.println("Your new Account Balance is " + customerBalance + "\n");
            previousTransaction = amountDeposit;
        } else if (amountDeposit <= 0) {
            System.out.println("You can only deposit the amount which is greater than zero. Please enter any other amount");
        } else {
            System.out.println("Please enter any valid numeric value. ");
        } // if-else ends
    } // deposit method ends

    // method to withdraw money
    public void withdraw(double amountWithdraw) {
        if (amountWithdraw <= customerBalance) {
            customerBalance = customerBalance - amountWithdraw;
            System.out.println("Your new Account Balance is " + customerBalance);
            previousTransaction = -amountWithdraw;
        } else if (amountWithdraw > customerBalance) {
            System.out.println("You don't have enough balance in your account.");
        } else {
            System.out.println("Please enter any numeric value. ");
        } // if-else ends
    } // withdrawn method ends

    // method to display previous transaction
    public void previousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction record found. ");
        } // if-else ends
    } // previous transaction method ends

    // method to calculate the interest
    public void calculateInterest(int years) {
        double interestRate = 0.0185;
        double newBalance;

        if (years > 0) {
            newBalance = customerBalance + (customerBalance * interestRate * years);
            System.out.println("After years " + years + "your account will be " + newBalance);
        } else if (years <= 0) {
            System.out.println("Please enter the years greater than 0. ");
        } else {
            System.out.println("Please enter any valid numeric value. ");
        } // if-else ends
    } // calculate interest method ends

    // method to show menu to customer
    public void showMenu() {
        System.out.println("Which options would you like to perform?");
        System.out.println("A. Check Balance \nB. Make Deposit \nC. Make Withdrawal \nD. View Previous Transaction " +
                "\nE. Calculate Interest \nF. Exit The Application");

        int optionInput;
        do {
            // reading the input from the user
            Scanner input = new Scanner(System.in);
            optionInput = input.nextInt();

            // using switch statement to do specific task
            switch (optionInput) {
                case 1:
                    System.out.println("Selected Option: " + "Check Balance");
                    checkBalance();
                    break;

                case 2:
                    System.out.println("Selected Option: " + "Make Deposit");
                    System.out.println("Enter the amount you want to deposit to your account");
                    Scanner amountEnteredDeposit = new Scanner(System.in);
                    double amountDeposit = amountEnteredDeposit.nextDouble();
                    deposit(amountDeposit);
                    break;

                case 3:
                    System.out.println("Selected Option: " + "Make Withdrawal");
                    System.out.println("Enter the amount you want to withdraw from your account");
                    Scanner amountEnteredWithdraw = new Scanner(System.in);
                    double amountWithdraw = amountEnteredWithdraw.nextDouble();
                    withdraw(amountWithdraw);
                    break;

                case 4:
                    System.out.println("Selected Option: " + "View Previous Transaction");
                    previousTransaction();
                    break;

                case 5:
                    System.out.println("Selected Option: " + "Calculate Interest");
                    System.out.println("How many years of accrued interest? ");
                    Scanner yearsEnteredInterest = new Scanner(System.in);
                    int years = yearsEnteredInterest.nextInt();
                    calculateInterest(years);
                    break;

                default:
                    System.out.println("Wrong Selection");
                    break;
            } // switch ends
            // again calling showMenu() function. in case the user wants to some more tasks.
            showMenu();
        } while (optionInput != 6) ; // do while ends
    } // show menu ends
}// class ends
