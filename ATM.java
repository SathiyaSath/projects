package ATM_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	class ATM {
		private List<Account> accountslist;

	    public ATM() {
	        accountslist = new ArrayList<>();
	        accountslist.add(new Account("1234567890", 1000.0, "1111"));
	        accountslist.add(new Account("9876543210", 300000.0, "2224"));
	        accountslist.add(new Account("9876543212", 230000.0, "1122"));
	        accountslist.add(new Account("9876543112", 5000.0, "2234"));
	        accountslist.add(new Account("9876543321", 20000.0, "7688"));
	        accountslist.add(new Account("9876543201", 5030.0, "0987"));
	     
	    }

	    public void start() 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.nextLine();

	        Account account = getAccount(accountNumber);
	        if (account != null)
	        {
	            System.out.print("Enter PIN: ");
	            String enteredPin = scanner.nextLine();
	            if (account.validatePin(enteredPin))
	            {
	                showMenu(account);
	            } 
	            else 
	            {
	                System.out.println("Incorrect PIN!");
	            }
	        }
	        else 
	        {
	    
	        	System.out.println("Invalid account number!");
	        }
	    }

	    private Account getAccount(String accountNumber)
	    {
	        for (Account account : accountslist)
	        {
	            if (account.getAccountNumber().equals(accountNumber))
	            {
	                return account;
	            }
	        }
	        return null;
	    }

	    private void showMenu(Account account) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n====== ATM Menu==================================");
	            System.out.println("\t1. Withdraw");
	            System.out.println("\t2. Check Balance");
	            System.out.println("\t3. Print Receipt");
	            System.out.println("\t4. Exit");
	            System.out.println("====================================================");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    withdraw(account);
	                    break;
	                case 2:
	                    checkBalance(account);
	                    break;
	                case 3:
	                    printReceipt(account);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM!..........");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	                    break;
	            }
	        }
	    }

	    private void withdraw(Account account)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();

	        account.withdraw(amount);
	    }

	    private void checkBalance(Account account)
	    {
	        System.out.println("Your current balance is: " + account.getBalance());
	    }

	    private void printReceipt(Account account)
	    {
	    	System.out.println("========================================");
	        System.out.println("============Receipt:=================");
	    	System.out.println("========================================");

	        System.out.println("\tAccount Number: " + account.getAccountNumber());
	        System.out.println("\n\tBalance: " + account.getBalance());
	    }
	}



