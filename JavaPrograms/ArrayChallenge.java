import java.util.Scanner;
public class ArrayChallenge{
	
	public static Scanner take = new Scanner(System.in);

	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of array\r");
		size = take.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter "+size+" Elements\r");
		for (int i=0; i<myArray.length; i++) {
			myArray[i] = take.nextInt();
		}
		sortedArray(myArray);
		System.out.println("The sorted array is given below");
		printArray(myArray);
	}

	public static void sortedArray(int[] myArray){
		int temp = 0;
		for (int i=0; i<myArray.length-1; i++) {
			for (int j=0; j<myArray.length-i-1; j++) {
				if(myArray[j]<myArray[j+1]){
					temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] myArray){
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
