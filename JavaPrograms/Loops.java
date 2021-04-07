public class Loops{
	public static void main(String[] args) {
		int no=4,count=0;
		while(no<=20){
			no++;
			if (!isEvenNumber(no)) {
				continue;
			}else{		
				count++;
				System.out.println("Even Numer :" +no);	
			}
		}
		System.out.println("No. of Even Number is :"+count);
	}
	public static boolean isEvenNumber(int number) {
		if (number%2==0) {
			return true;
		}else{
			return false;
			
		}
	}
}