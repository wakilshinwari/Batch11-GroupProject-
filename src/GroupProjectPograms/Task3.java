package GroupProjectPograms;

public class Task3 {

	public static void main(String[] args) {
		/*Create a 2D array of integers. 
		 * Develop a program which will calculate the sum of
		 *   even and odd numbers for that array.
		 */
		
		int [][]nums= {
				{1, 2, 3, 4, 5, 6},
				{8, 9, 10, 11, 12, 13},
				{14,15,16,17,18,19}
		};
		for (int i=0;i<3; i++) {
			int sum=0;
			for (int j=0; j<6;j++) {
				sum +=nums[i][j];
				System.out.println("The sum of even and odd numbers are:"+(i+1)+" "+sum);
			}
		}
	}

}
