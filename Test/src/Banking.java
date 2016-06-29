
import java.util.Scanner;
import java.util.Random;

public class Banking {

    public Banking() {
        // Declaring variables, Scanner and Random objects
        String name;
        double initial;
        Scanner input = new Scanner(System.in);
        Random numero = new Random();
        int number = 1 + numero.nextInt(9999);

        //Getting the initial values
        System.out.println("Registering a new client.");
        System.out.print("Type your name: ");
        name = input.nextLine();

        System.out.print("Enter the initial amount of this account: ");
        initial = input.nextDouble();

        //Creating the new account
        Account myAccount = new Account(name, number, initial);
        myAccount.start();
    }

    public static void main(String[] args) {

        new Banking(); // constructor
    }

    private class Account {

        private String name;
        private int number, withdrawals;
        private double balance;
        private double rate_interest = 5;
        private int time = 1;
        Scanner input = new Scanner(System.in);

        // Documentation
        /* public Account(String name, int number, double initialBalance)
         Constructor
         Paramters
         name:  name of the person holding bank account which is a string
         number : Unique Account number which is an integer
         initialBalance : initial account balnce which is a double */
        
        public Account(String name, int number, double initialBalance) {
            this.name = name;
            this.number = number;
            balance = initialBalance;
            withdrawals = 0;
        }

        public void bankStatement() {
            System.out.println("\tBank Statement");
            System.out.println("Name: " + this.name);
            System.out.println("Account number: " + this.number);
            System.out.printf("Balance: %.2f\n", this.balance);
            System.out.println("Withdrawals made: " + this.withdrawals + "\n");

        }

        public void cashOut(double value) {
            if (balance >= value) {
                balance -= value;// balance = balacnce - value
                withdrawals++;
                System.out.println("Cash value out: " + value);
                System.out.println("New balance: " + balance + "\n");
            } else {
                System.out.println("Not enough balance amount. Deposit some value.\n");
            }
        }

        public void deposit(double value) {
            balance += value;
            System.out.println("Deposit: " + value);
            System.out.println("New balance: " + balance + "\n");
        }

        public void start() {
            int option;

            do {
                showMenu();
                option = input.nextInt();
                chooseOption(option);
            } while (option != 6);
        }

        public void showMenu() {

            System.out.println("\t Choose the right option");
            System.out.println("1 - Check bank statement");
            System.out.println("2 - Cash out");
            System.out.println("3 - Deposit");
            System.out.println("4 - Simple Interest");
            System.out.println("5 - Compound Interest");
            System.out.println("6 - Exit\n");//
            System.out.print("Option: ");

        }

        public void chooseOption(int option) {
            double value;

            switch (option) {
                case 1:
                    bankStatement();
                    break;
                case 2:
                    if (withdrawals < 3) {
                        System.out.print("How much do you want cash out: ");
                        value = input.nextDouble();
                        cashOut(value);
                    } else {
                        System.out.println("Withdrawals dayly limit reached.\n");
                    }
                    break;

                case 3:
                    System.out.print("How much do you want deposit: ");
                    value = input.nextDouble();
                    deposit(value);
                    break;

                case 4:
                    System.out.println("Calculating simple interest");
                    if (balance > 0) {
                        System.out.println((balance * time * rate_interest) / 100);
                    } else {
                        System.out.println("No money in account");
                    }
                    break;
                case 5:
                    // compund interest
                    System.out.println("Calculating simple interest");
                    if (balance > 0) {
                        System.out.println("... formula");
                    } else {
                        System.out.println("No money in account");
                    }

                    break;
                case 6:
                    System.out.println("Closed system.");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

}
