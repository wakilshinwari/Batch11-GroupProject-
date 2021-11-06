package GroupProjectPograms;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner and calculate the sum of all
		 * stored elements in that array.
		 */

		double[] numbers = new double[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Please enter the number");
			numbers[i] = scanner.nextDouble();
		}
double sum=0;
		for (double number:numbers) {
			sum+=number;
		}
		System.out.println(sum);
	}
}
