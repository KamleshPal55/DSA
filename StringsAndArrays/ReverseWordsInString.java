/*
 * I/P - The sky is blue
 * O/P - blue is sky The
 */

package StringsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String result = reverseWords1(input);
		//String result = reverseWords2(input);
		System.out.println("Reversed string is: " + result.trim());
		scan.close();
	}

	public static String reverseWords1(String str) {
		StringBuilder sb = new StringBuilder();
		String[] words = str.trim().replaceAll("\\s+", " ").split(" "); //RegEx "\\s+" will take tab and multiple spaces into account.
		System.out.println("Length is: " + words.length);
		for(int i = words.length-1; i >= 0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString();
	}

	// This solution does not return proper string output. Output is: Reversed string is: [blue, is, sky, the]
	public static String reverseWords2(String str) {
		String[] words = str.trim().replaceAll("\\s+", " ").split(" ");
		int start;
		int end = words.length-1;
		String temp;

	for(start = 0; start < end; start++, end--) {
		temp = words[start];
		words[start] = words[end];
		words[end] = temp;
	}
	return Arrays.toString(words);
}

}
