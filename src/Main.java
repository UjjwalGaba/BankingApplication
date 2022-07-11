import java.util.Scanner;

public class Main {

    // main method
    public static void main(String[] args) {

        Account1 account1 = new Account1();

        // asking the user to enter their name
        System.out.println("Please enter your name.");
        Scanner cName = new Scanner(System.in);
        String customerName = cName.next();

        // asking the customer ID from the user
        System.out.println("Please enter your customer ID.");
        Scanner cID = new Scanner(System.in);
        String customerID = cID.next();

        // printing the welcome message with customer name
        System.out.println("WELCOME " + customerName + " to the MY BANK.");

        // calling the function to show menu
        account1.showMenu();


    }

}
