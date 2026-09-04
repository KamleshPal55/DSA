/*
 * I/P =>{3,2,4,7,10,6,5}  O/P => {3,7,5}
 *
 * To solve this problem we created new array of size of no of odd elements in the array.
 */

package Arrays;

import java.util.Arrays;

public class RemoveEvenIntFromArray {
	public static void main(String[] args) {
	int[] arr = {3,2,4,7,10,6,5};
	int[] oddNumArr = removeEvenInt(arr);
	System.out.println(Arrays.toString(oddNumArr));
	}

	public static int[] removeEvenInt(int[] arr) {
		int oddCount = 0;
		for(int num : arr) {
			if(num % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}
}
