package StringsAndArrays;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "KamleshPal";
		String result = reverseString(str);
		System.out.println(result);
	}
	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int start;
		int end = arr.length-1;
		char temp;
		for(start = 0; start < end; start++, end--) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return Arrays.toString(arr);
	}

}
