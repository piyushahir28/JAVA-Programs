import java.util.Scanner;

class X{
	private int x;

	public X(int x){
		this.x=x;
	}
	public void x(){
		for (int x=1; x<=12; x++) {
			System.out.print(x*this.x + " ");
		}
	}
}
public class Scope{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		//int x = scanner.nextInt();
		X x = new X(scanner.nextInt());
		x.x();
	}
}