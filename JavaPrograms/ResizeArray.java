import java.util.Scanner;
import java.util.Arrays;
public class ResizeArray{
	
	private static int[] array = new int[10];
	private static Scanner take = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the 10 Elements of Arrays");
		getArray();
		printArray(array);
		resizeArray();
		System.out.println("Enter the 12 Elements of Arrays");
		getArray();
		printArray(array);
	}

	public static void getArray(){
		for (int i=0; i<array.length; i++) {
			array[i] = take.nextInt();
		}
	}

	public static int printArray(int[] array){
		System.out.println(Arrays.toString(array));
		return 0;
	}

	public static void resizeArray(){
		int[] original = array;
		array = new int[12];
		for (int i=0; i<original.length; i++) {
			array[i] = original[i];
		}
	}
}