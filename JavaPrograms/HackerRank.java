import java.util.Scanner;
public class HackerRank{
	public static void main(String[] args) {
		int a;
		double b;
		char c;
		String d;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextFloat();
		//c = s.next();
		c = (char)s.nextInt();
		s.nextLine();
		d=s.nextLine();
		//b=DecimalUtils.round(b,2);
		System.out.println(a);
		System.out.println(String.format("%2f",b));
		System.out.println(c);
		System.out.println(d);
	}
}