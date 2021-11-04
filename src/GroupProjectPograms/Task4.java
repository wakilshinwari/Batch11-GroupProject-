package GroupProjectPograms;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*Create an array on double values using scanner 
		 * and calculate the sum of all stored elements in that array.
		 */
          Scanner scan=new Scanner(System.in);
          System.out.println("Please enter a number");
          double []numbers=new double[5];
           double sum=0;
         
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= scan.nextDouble();
			sum+=numbers [i];
		}
				
			}
	System.out.println("The sum is "+sum);
				}
				
				
		

