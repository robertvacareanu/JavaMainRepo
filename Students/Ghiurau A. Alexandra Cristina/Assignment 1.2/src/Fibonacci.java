/**
 * 
 * @author Alexa
 *
 */
public class Fibonacci {
	public static void main(String[] args) {

		int sum = 0;
		int f0 = 0;
		int f1 = 1;
		int fn = 0;
		// f32 = 3524578 ; f33 = 5702887 => in order for the values in the Fibonacci sequence
		// not exceed 4000000 the loop must be less than 32
		for (int counter = 0; counter < 32; counter++) {
			fn = f0 + f1;
			if (f1 % 2 == 0) {
				sum += f1;
			}
			f0 = f1;
			f1 = fn;
		}
		System.out.println(sum);
	}
	// PS. I've never thought of the recursive method
	// I think this is the 1st twist actually (I'm not sure though)
	// but it will probably be good practice to solve this in the recursive way as well
	
}
