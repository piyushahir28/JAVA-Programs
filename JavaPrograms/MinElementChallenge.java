import java.util.Scanner;
public class MinElementChallenge{
	public static Scanner take = new Scanner(System.in);	

	public static void main(String[] args) {
		int count;
		System.out.println("Enter the size of array : ");
		count = take.nextInt();
		int[] array = readIntegers(count);
		int min = findMin(array);
		System.out.println("Smallest Element : "+min);
	}

	public static int[] readIntegers(int count){
		int[] hereWeTake = new int[count];
		for (int i=0; i<hereWeTake.length; i++) {
			hereWeTake[i] = take.nextInt();
		}
		return hereWeTake;
	}

	public static int findMin(int[] array){
		int temp = array[0];
		for (int i=0; i<array.length; i++) {
			if(temp>array[i])
				temp=array[i];
		}
		return temp;
	}
}