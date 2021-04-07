import java.util.Scanner;
import java.util.ArrayList;
class Contacts{
	private ArrayList<String> name  = new ArrayList<String>();
	private ArrayList<String> number  = new ArrayList<String>();

	public void getContacts(String getname, String getnumber){
		name.add(getname);
		number.add(getnumber);
	}

	public void modifyContact(String putname, String newname,String putno){
		int index = findIndex(putname);
		name.set(index,newname);
		number.set(index,putno);
	}

	public void removeContact(String getname){
		int index = findIndex(getname);
		name.remove(index);
		number.remove(index);
	}

	public void findContact(String getname){
		int index = findIndex(getname);
		if(index==-1){
			System.out.println(getname+" is not exist in this list.");
		}else{
			System.out.println("We found.");
			System.out.println("Name       : "+name.get(index));
			System.out.println("Ph. Number : "+number.get(index));
		}
	}

	public void printContact(){
		for(int i=0; i<name.size(); i++){
			System.out.println("Name       : "+name.get(i));
			System.out.println("Ph. Number : "+number.get(i));
		}
	}

	private int findIndex(String getname){
		return name.indexOf(getname);
	}
}
public class ArrayListChallenge{
	
	private static Scanner take = new Scanner(System.in);
	private static Contacts mobile = new Contacts();

	public static void main(String[] args) {

		int choice = 0;
		boolean not = false;
		showingChoices();
		while(!not){
			System.out.println("Enter the Choice : ");
			choice = take.nextInt();
			switch(choice){
				case 0:
					showingChoices();
					break;
				case 1:
					mobile.printContact();
					break;
				case 2:
					addContacts();
					break;
				case 3:
					updateContacts();
					break;
				case 4:
					removeContacts();
					break;
				case 5:
					searchContacts();
					break;
				case 6:
					not = true;
					break;
			}
		}
	}

	public static void showingChoices(){
		System.out.println("\t 0 For Main Menu.");
		System.out.println("\t 1 For Print Contact List.");
		System.out.println("\t 2 For Adding New Contacts.");
		System.out.println("\t 3 For Updaing the Existing Ones.");
		System.out.println("\t 4 For Removing any Contact.");
		System.out.println("\t 5 For Searching any Contact.");
		System.out.println("\t 6 For Quiting the Application.");
	}

	public static void addContacts(){
		String putname;
		String putno;
		take.nextLine();
		System.out.println("Enter Name : ");
		putname = take.nextLine();
		//take.nextLine();
		System.out.println("Enter Number : ");
		putno = take.nextLine();
		//take.nextLine();
		mobile.getContacts(putname,putno);
	}

	public static void updateContacts(){
		String putno,putname,newname;
		take.nextLine();
		System.out.println("Ente the name you want to update : ");
		putname = take.nextLine();
		System.out.println("Ente the new Name : ");
		newname = take.nextLine();
		System.out.println("Ente the new Number : ");
		putno = take.nextLine();
		mobile.modifyContact(putname,newname,putno);
	}

	public static void removeContacts(){
		String putname;
		take.nextLine();
		System.out.println("Ente the name you want to remove : ");
		
		putname = take.nextLine();
		mobile.removeContact(putname);
	}

	public static void searchContacts(){
		String putname;
		take.nextLine();
		System.out.println("Ente the name you want to Serach : ");
		putname = take.nextLine();
		mobile.findContact(putname);
	}
}