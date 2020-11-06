/**
 * Author name : MEGHANA T 
 * date: 05/11/2020 
 * desc: testing compilation and running to reverse elements of array and return the sorted list
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		list = getSorted(arr);
		System.out.println(list);
	}

	public static List<Integer> getSorted(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int reverse = 0;
			while (num != 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			result.add(reverse);
		}
		System.out.println("Reversal of Array:" + result);
		Collections.sort(result);
		return result;

	}

}
