/**
 * Author name : MEGHANA T
 * date: 05/11/2020 
 * desc: testing compilation and running to find frequency of each character 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int length = str.length();
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		result = countChars(arr);
		System.out.println(result);
	}

	public static Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		int[] frequency = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			frequency[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					frequency[i]++;
					arr[j] = '0'; // to avoid visited character
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] != ' ' && arr[k] == '0')
				result.put(arr[k], frequency[k]);
		}

		return result;

	}
}
