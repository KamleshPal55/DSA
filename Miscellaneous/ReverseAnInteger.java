/*
 * I/P => 1234   O/P => 4321
 * I/P => -1234  O/P => -4321
 * I/P => 2147483647 (Maximum value of int)  O/P => 7463847412 (Overflow of maximum value of int)
 *
 */

package Miscellaneous;

import java.util.Scanner;

public class ReverseAnInteger {

	public static void main(String[] args) {
		System.out.print("Enter no: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		long reverse = reverseInt(num);
		System.out.println("Reverse of int is: " + reverse);
	}
	public static long reverseInt(int num) {
		boolean isNegative = num < 0;
		if(isNegative) {
			num = num * -1;
		}
		long reverseNum = 0; //considering long in case reverse of int could overflow max of int value
		int lastDigit;
		while(num != 0) {
			lastDigit = num % 10;
			reverseNum = reverseNum*10 + lastDigit;
			num = num / 10;
		}
		return isNegative ? reverseNum * -1 : reverseNum;
	}

}
