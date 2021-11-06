package GroupProjectPograms;

public class Task7 {

	public static void main(String[] args) {
		/*Write a java program to check whether a given number is prime or not?
		 * 
		 */

		//what are prime numbers?? any number divided by 1---- 0 and minus numbers are not prime--primer starts with 2
		
		int number=11;
		boolean isPrime=true;
		if (number>1) {
		
			for (int i=2; i<number; i++) {
				if (number%i==0) {
					isPrime=false;
					break;
				}
			}
				}else {
					isPrime = false;
				}
		if (isPrime) {
			System.out.println(number+"is prime ");
			}
		}else {
			isPrime=false;{
				System.out.println("Number is not prime");
			}

		}
}
