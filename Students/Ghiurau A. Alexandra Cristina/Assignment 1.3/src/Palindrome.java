/**
 * 
 * @author Alexa
 *
 */
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int product;
		int max = 0;
		for (int counter1 = 100; counter1 <= 999; counter1++) {
			for (int counter2 = 999; counter2 >= 100; counter2--) {
				product = counter1 * counter2;
				// System.out.println(counter1+ " * "+ counter2 +" = "+ product);
				if (checkIfPalindrome(product) == true) {
					if (product > max) {
						max = product;
						System.out.println(product + " is palindrome");
						System.out.println( counter1 + " * " + counter2 + " = " + product);

					}
				}
			}
		}
		System.out.println("The largest of them all is " + max);

	}

	public static boolean checkIfPalindrome(int n) {

		int length = (int) (Math.log10(n) + 1);
		if (length == 5) {
			if ((n / 10000 == n % 10)) {
				n /= 10;
				if (n % 10 == (n / 100) % 10) {
					return true;
				}
			}
		}
		if (length == 6) {
			if ((n / 100000 == n % 10)) {
				n /= 10;
				if (n % 10 == (n / 1000) % 10) {
					n /= 10;
					if (n % 10 == (n / 10) % 10)
						return true;
				}
			}
		}

		return false;
	}
}
