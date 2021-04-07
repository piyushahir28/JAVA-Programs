import java.util.Scanner;
import java.util.ArrayList;
class Customer{
	Double mydouble = new Double(0.00);
	ArrayList<Double> transactions;
	private String name;

	public Customer(String name, double initialAmount){
		this.name=name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public void addTransaction(double amount){
		this.transactions.add(amount);
	}

	public String getName(){
		return name;
	}
	public ArrayList<Double> getTransactions(){
		return transactions;
	}
}
class Branch{
	private String name;
	ArrayList<Customer> myCustomer;
	public Branch(String name){
		this.name=name;
		this.myCustomer = new ArrayList<Customer>();
	}
	public String getName(){
		return name;
	}

	public ArrayList<Customer> getCustomers(){
		return myCustomer;
	}

	public boolean newCustomer(String name, double amount){
		if(findCustomer(name)==null){
			this.myCustomer.add(new Customer(name,amount));
			return true;
		}
		return false;
	}
	public boolean addCustomerTransactions(String name, double amount){
		if(findCustomer(name)!=null){
			Customer existingCustomer = findCustomer(name);
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}
	private Customer findCustomer(String name){
		for (int i=0; i<myCustomer.size(); i++) {
			if (myCustomer.get(i).getName().equals(name));
				return this.myCustomer.get(i);
		}
		return null;
	}	
}
class Bank{
	private String name;
	ArrayList<Branch> myBranch;

	public Bank(String name){
		this.name=name;
		this.myBranch = new ArrayList<Branch>();
	}

	public boolean addBranch(String name){
		if(findBranch(name)==null){
			this.myBranch.add(new Branch(name));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String branchName, String customerName, double amount){
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName,amount);
		}	
		return false;
	}

	public boolean addCustomerTransactions(String branchName, String customerName, double amount){
		Branch branch = findBranch(branchName);
		if (branch != null) {
			branch.addCustomerTransactions(customerName,amount);
		}
		return false;
	}

	private Branch findBranch(String name){
		for (int i=0; i<myBranch.size(); i++) {
			if (myBranch.get(i).getName().equals(name));
				return this.myBranch.get(i);
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean transactions){
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer Details for branch ["+branch.getName()+"]");
			ArrayList<Customer> branchCustomer = branch.getCustomers();
			for (int i=0; i<branchCustomer.size(); i++) {
				Customer branchCustomers = branchCustomer.get(i);
				System.out.println(" Customer" +branchCustomers.getName()+"["+(i+1)+"]");
				if (transactions) {
					System.out.println("Transactions : ");
					ArrayList<Double> myTransactions = branchCustomers.getTransactions();
					for (int j=0; j<myTransactions.size(); j++) {
						System.out.println("["+(j+1)+"] Amount"+myTransactions.get(j));
					}
				}
			}
			return true;
		}else{
			return false;
		}
	}
}
public class AutoboxingChallenge{
	public static void main(String[] args) {
		Bank newBank = new Bank("State Bank of India");

		newBank.addBranch("Dussherra Maidan");

		newBank.addCustomer("Dussherra Maidan","Piyush Ahir",50000);
		newBank.addCustomer("Dussherra Maidan","Rakesh Ahir",100000);
		newBank.addCustomer("Dussherra Maidan","Lalita Ahir",25000);

		newBank.addBranch("Tagore Marg");
		newBank.addCustomer("Tagore Marg","Meenu",2500);

		newBank.addCustomerTransactions("Tagore Marg","Meenu",2500);
		newBank.addCustomerTransactions("Tagore Marg","Meenu",500);
		newBank.addCustomerTransactions("Tagore Marg","Meenu",3500);
		newBank.listCustomers("Dussherra Maidan",false);

	}
}