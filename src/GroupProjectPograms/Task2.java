package GroupProjectPograms;

public class Task2 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers.
		 *  Develop a program which will identify/print the even numbers only.
		 */

		int  [][]nums= {
				{3,7,9,11},
				{4,8,10,12},
				{7,15,17,19},
				{22,88,12,14},
		};	
		
		int oddNums [][]=new int [4] [3];
		
		for (int i=0; i<nums.length;i++) {
			for (int j=0; j<nums[0].length;j++) {
				if (nums[i][j]%2==0);
				System.out.println("The even numbers are:"+nums[i][j]+" ");
			}
			
		}
		
			

		}
		

		}
		


