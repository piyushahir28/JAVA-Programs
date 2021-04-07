import java.util.Scanner;
public class MinandMaxChallenge{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean first = true;
		int max=0,min=0;

		while(true){
			System.out.println("Enter the  Number : ");
			boolean check = s.hasNextInt();

			if (!check) {
				break;
			}else{
				int n = s.nextInt();
				if (first) {
					first = false;
					max = n;
					min = n;
				}
				if (max<n) {
					max = n;
				}
				if (min>n) {
					min=max;
				}
			}
			s.nextLine();
		}
		s.close();
		System.out.println("Maximum Number : "+ max);
		System.out.println("Minimum Number : "+ min);
	}
}