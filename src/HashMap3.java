/**
 * Author name : MEGHANA T
 * date: 05/11/2020 
 * desc: testing compilation and running to get a number and its square in HashMap
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		map = getSquares(arr);
		System.out.println(map);

	}

	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int j = 0; j < arr.length; j++) {
			result.put(arr[j], (arr[j] * arr[j]));
		}
		return result;
	}

}
