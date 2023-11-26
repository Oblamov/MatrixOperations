import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Dont forget your matrix elements would be equal to each other!!!");
		System.out.println("****************************************************************");

		System.out.print("Enter your matrices row number= ");
		int rowN = scan.nextInt();
		System.out.print("Enter your matrices column number= ");
		int columnN = scan.nextInt();
		System.out.print("How many matrices do you want to add?= ");
		int matricN = scan.nextInt();

		int[][] inputs = new int[rowN][columnN];
		// int[][] sum = new int[rowN][columnN];


		for (int m = 1; m <= matricN; m++) {
			
			for (int r = 0; r < rowN; r++) {

				for (int c = 0 ; c < columnN; c++) {

					inputs[r][c] += scan.nextInt();
					
				}

			}
		}
		//I have a headache..
		//If you wanna take input your array you can use Arrays.toString(array) but,
		//if you have multi-dimensional array you need to use Arrays.deepToString(array) format.
		System.out.println(Arrays.deepToString(inputs));


	}

}
