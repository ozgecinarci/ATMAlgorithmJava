import java.util.Scanner;

  public class ATM {
		public static void main (String [] args){
			Scanner scan= new Scanner (System.in);
			int balance=1000;
			System.out.println(" 1: View Balance ");
			System.out.println(" 2: Invest Money ");
			System.out.println(" 3: Withdraw Money ");
			System.out.println(" 4: Logout from System");
			while(true){
				System.out.println("Please enter a number:");
			int transaction =scan.nextInt();
			switch(transaction){
			case 1:
				System.out.println("Your balance is: "+balance+" TL");
				break;
			case 2:
			    System.out.println("How much money will you invest?");
			    int amount=scan.nextInt();
			    balance+=amount;
			    System.out.println("Your balance is: "+balance+" TL");
			    break;
			case 3:
				System.out.println("How much money will you withdraw?");
				amount=scan.nextInt();
				balance-=amount;
				if(amount>balance){
					System.out.println("INVALID TRANSACTION");
				}
				else{
				System.out.println("Your balance is: "+balance+" TL");
				}
			case 4:
				System.out.println("Logging out of the system...");
			default:
				System.out.println("INVALID TRANSACTION");
			}
			System.out.println("Would you like to make a new transaction? y/n");
			String newt= scan.next();
			if(newt.equals("y"))
				continue;
			if(newt.equals("y"))
				System.out.println("Logging out of the system...");
				break;
			
				
			
	}
	}
	}



