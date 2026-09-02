/*
 * Given a sorted array of positive integers, rearrange the array alternatively
 * i.e first element should be the maximum value, second minimum value, third-second max, fourth-
 * second minimum and so on.
 *
 */

package Arrays;

import java.util.Arrays;

public class RearrangeSortedArrayInMaxMinForm {
	public static void main(String[] args) {
		//int[] arr = {1, 3, 4, 5, 8, 10, 11};
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println("Input array is: " + Arrays.toString(arr));
		//int[] result = rearrangeArr(arr);
		int[] result = rearrangeArr2(arr);
		System.out.println("Output array is: " + Arrays.toString(result));
	}

	public static int[] rearrangeArr(int[] arr) {
		if(arr.length < 2) {
			return arr;
		}
		int[] temp = new int[arr.length];

		int minIdx = 0;
		int maxIdx = arr.length - 1;
		int i = 0;
		while(i < arr.length){
			temp[i++] = arr[maxIdx--];
			if(i < arr.length)  //Without this check indexOutOfBound thrown for odd no of elements in array
			  temp[i++] = arr[minIdx++];
		}
		//Copy temp[] to arr[]
		for(int k=0; k<arr.length; k++) {
			arr[k] = temp[k];
		}
			return arr;
	}

	//This method utilize the flag trick to execute first if condition and next time else condition.
	public static int[] rearrangeArr2(int[] arr) {
		if(arr.length < 2) {
			return arr;
		}
		int len = arr.length;
		int[] temp = new int[len];
		int minIdx = 0;
		int maxIdx = len-1;
		boolean flag = true;
		for(int i=0; i<len; i++) {
			if(flag) {
				temp[i] = arr[maxIdx--];
			}else {
				temp[i] = arr[minIdx++];
			}
			flag = !flag;
		}
		//Copy temp[] to arr[]
		for(int i=0; i<len; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

	//Method will replace elements in place to result solution on O(1) of space complexity.
}
