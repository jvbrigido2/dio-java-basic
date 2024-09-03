import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String agency;
        String clientName;
        double balance;

        System.out.println("Please, enter the account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Please, enter the agency: ");
        agency = sc.next();
        sc.nextLine();

        System.out.println("Please, enter your name: ");
        clientName = sc.nextLine();

        System.out.println("Please, enter your account balance: ");
        balance = sc.nextDouble();

        System.out.println("Hello "+ clientName+ ", Thank you for creating an account with our bank, " +
                "your agency is " + agency + ", account " + accountNumber + " and your balance " +
                balance + " is now available for withdrawal.");

        sc.close();
    }
}
