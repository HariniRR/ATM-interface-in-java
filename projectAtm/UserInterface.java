package projectAtm;

import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
	public static boolean exitFlag = false;
    public void isAuth(int userId, String pass) {
        // Initialize HashMap with keys and values using an instance initializer
        HashMap<Integer, String> idpass = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
		{
            put(1010507,"9321");
            put(1011508,"4895");
            put(1012609,"2546");
            put(1013605,"8952");
        }};
        //is authenticated?
        if (idpass.containsKey(userId)) {
                accType();
                return;
            }
        else {
        System.out.println("Invalid user name or password.");
        	}
    }

	public void accType() {
		Scanner s=new Scanner(System.in);
		System.out.println("Say your account type:  \n 1.Savings Account \n 2.Checking Account  \n 3.exit");
		int acc=s.nextInt();
		switch(acc) {
		case 1:
			saving();
			break;
		case 2:
			checkBalance();
			break;
		case 3:
			System.out.println("Thank you! Come again");
			UserInterface.exitFlag = true;
			break;
		default:
			System.out.println("Invalid type");
			break;
		}
	}

	 public void saving(){
		 int operate = 0;
		 int data=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Operation: \n 1.credit \n 2.Debit \n 3.View balance");
		 operate = sc.nextInt();
		 switch(operate) {
		 case 1:
			 System.out.println("Enter amount to credit: ");
			 data=sc.nextInt();
			 if(data<=0) {
				 System.out.print("invalid amount to credit");
			 }
			 credit(data);
			 break;
		 case 2:
			 System.out.println("Enter amount to debit: ");
			 data=sc.nextInt();
			 if(data<=0) {
				 System.out.print("invalid amount to debit");
			 }
			 debit(data);
			 break;
		 case 3:
			 checkBalance();
			 break;
		default:
			System.out.println("Invalid operation.");
			break;
				
		 }
	 }

	
	int amount=0;
	public void checkBalance() {
		if(amount<100) {
			System.out.println("Balance: "+ amount+" \n INSUFFICIENT BALANCE");
		}
		else {
		System.out.println("Balance: "+ amount);}
	}
	public void credit(int data) {
		this.amount=amount + data;
		System.out.println("Amount credited!");
		checkBalance();
	}
	 public void debit(int data) {
			this.amount=amount - data;
			System.out.println("Amount debited!");
			checkBalance();
		}
	 
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        UserInterface ui=new UserInterface();
        System.out.println("Welcome to my ATM project.");
        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // To consume leftover newline
        System.out.print("Enter the pin number: ");
        String pass = sc.nextLine();
        do {
        ui.isAuth(userId, pass);
        }while(!exitFlag);
        sc.close();
    }	
}