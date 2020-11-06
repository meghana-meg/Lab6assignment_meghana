/**
 * Author name : MEGHANA T 
 * date: 05/11/2020 
 * desc: testing compilation and running to get Second Smallest element and converting array as list
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = getSecondSmallest(arr);
		System.out.println(result);
	}

	public static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<>(arr.length); // converting int array to integer list
		for (int i : arr) {
			input.add(Integer.valueOf(i));
		}
		Collections.sort(input);
		return input.get(1);
	}

}
