/*
 * I/P : The sky is blue
 */
package StringsAndArrays;

import java.util.Scanner;

public class ReverseCharsInEachWordInString {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//String result = reverseCharsInEachWord1(input);
		String result = reverseCharsInEachWord2(input);
		System.out.println("Output string: " + result.trim());
	}

	public static String reverseCharsInEachWord1(String str) {
		if(str == null || str.length() <= 1)
			return str;
		String[] words = str.trim().split("\s+"); // Here not using replaceAll(), hence using RegEx in split() to take care multiple white spaces

		String revStr = "";
		for(String word : words) {
			String revWord = "";
			for(int i = word.length()-1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revStr = revStr + revWord + " ";
		}
		return revStr;
	}
	public static String reverseCharsInEachWord2(String str) {
		if(str == null || str.length() <= 1)
			return str;
		String[] words = str.trim().split("\s+"); // Here not using replaceAll(), hence using RegEx in split() to take care multiple white spaces

		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			String revWord = "";
			for(int i = word.length()-1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			sb.append(revWord);
			sb.append(" ");
		}
		return sb.toString();
	}

}
