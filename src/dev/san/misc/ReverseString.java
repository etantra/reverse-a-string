package dev.san.misc;

/**
 * Reverse a given String
 * @author Sandeep Hebbar
 * @version 1.0.0
 * @since 2017
 */
public class ReverseString {
	
	/**
	 * <p>Method to reverse a given String</p>
	 * <p><u>Example: "BOND" to "DNOB"</u> </p>
	 * 
	 * @param input : Input String to reverse
	 */
	public String reverseString(String input) {
		String output;
		if(null == input) {
			return input;
		} else if(input.length() < 1) {
			output = "";
		} else {
			// Self Recursive call
			output = String.valueOf(input.charAt(input.length()-1)) + reverseString(input.substring(0,input.length()-1));
		}
		return output;
	}

}
