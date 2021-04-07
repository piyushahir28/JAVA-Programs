import java.util.Scanner;

class here{
		private double balance,dp,wd;
		private long accno,phno;
		private String name,email;

		Scanner s = new Scanner(System.in);
		public void setters() {
			System.out.println("Enter your Name : ");
			name = s.nextLine();
			System.out.println("Enter your E-mail : ");
			email = s.nextLine();
			System.out.println("Enter your Account Number : ");
			accno = s.nextLong();
			s.nextLine();
			System.out.println("Enter your Phone Number : ");
			phno = s.nextLong();
			s.nextLine();
			System.out.println("Enter your Balance : ");
			balance = s.nextDouble();
		}
		public void getters() {
			System.out.println("Name : "+name);
			System.out.println("E-mail : "+email);
			System.out.println("Account Number : "+accno);
			System.out.println("Phone Number : "+phno);
			System.out.println("Balance : "+balance);	
		}
		public void deposit(){
			System.out.println("Enter Amount to be Deposit : ");
			dp = s.nextDouble();
			s.nextLine();
			balance+=dp;
		}
		public void withdrawl(){
			System.out.println("Enter Amount to be withdrawl : ");
			wd = s.nextDouble();
			s.nextLine();
			balance-=dp;
		}
}
public class Constructor{
	public static void main(String[] args) {
		
		Scanner o = new Scanner(System.in);

		here ob = new here();
		System.out.println("Enter the Details");
		ob.setters();
		System.out.println("Entered Details are");
		ob.getters();
		System.out.println("For withdrawl Press 1 or for Deposit 0");
		int check;
		check = o.nextInt();
		o.nextLine();
		if (check==1) {
			ob.withdrawl();
			ob.getters();
		}else if (check==0){
			ob.deposit();
			ob.getters();
		}else{
			System.out.println("Invalid Entry");
		}
	}
}
