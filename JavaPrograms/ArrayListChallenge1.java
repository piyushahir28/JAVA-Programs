import java.util.ArrayList;
import java.util.Scanner;
class Contact{
	private String name,number;

	public Contact(String name, String number){
		this.name=name;
		this.number=number;
	}

	public String getname(){
		return name;
	}
	public String getnumber(){
		return number;
	}

	public static Contact createContact(String name, String number){
		return new Contact(name,number);
	}
}

class MobilePhone{
	private ArrayList<Contact> myContact;

	public MobilePhone(){
		this.myContact = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact contact){
		myContact.add(contact);
		return true;
	}

	public void printContact(){
		for (int i=0; i<myContact.size(); i++) {
			System.out.println((i+1) + ". "+ myContact.get(i).getname() + " -> " + myContact.get(i).getnumber());
		}
	} 
}

public class ArrayListChallenge1{
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobile = new MobilePhone();
	
	public static void main(String[] args) {
		String name,number;
		System.out.println("Enter Name : ");
		name = scanner.nextLine();
		System.out.println("Enter Number ");
		number=scanner.nextLine();
		Contact myContact = Contact.createContact(name,number);
		mobile.addNewContact(myContact);
	}
}