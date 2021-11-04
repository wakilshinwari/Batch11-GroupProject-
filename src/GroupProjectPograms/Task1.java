package GroupProjectPograms;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		 
		

	int [] [] num1={
			
			{90, 100,110,120},
			{500,600,700,800},
	};
	int [] [] num2={ 
			
			{200,300,400,500},
			{800,900,1000,1100},
	};
	
	int num3[][]=new int[2][4];
	
	for (int i=0; i<2; i++) {
		for (int j=0; j<4; j++) {
			num3[i][j]=num1[i][j]+num2[i][j];
			System.out.println("The sum of all numbers is:"+num3[i][j]);

	}
		System.out.println();
	
	}
	
		}
		
	}

	


