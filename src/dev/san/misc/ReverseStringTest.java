package dev.san.misc;

/**
 * Test Class to run the Reverse String Logic
 * @author Sandeep Hebbar
 * @version 1.0.0
 * @since 2017
 */
public class ReverseStringTest {
	
	public static void main(String[] args) {
		System.out.println("ReverseStringTest");
		String input = "> T - U - X <";
		System.out.println("input-	"+input);
		ReverseString test = new ReverseString();
		String output = test.reverseString(input);
		System.out.println("output-	"+output);
	}
	
}
