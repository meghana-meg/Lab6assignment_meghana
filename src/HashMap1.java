/**
 * Author name : MEGHANA T 
 * date: 05/11/2020 
 * desc: testing compilation and running to sort based on values of a HashMap
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements:");
		// int i = 0;
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			hm.put(i, name);
			// n--;
		}

		System.out.println(hm);
		List<String> res = getValues(hm);
		System.out.println(res);
	}

	public static List<String> getValues(Map<Integer, String> hm) {
		List<String> res = new ArrayList<>();
		for (Map.Entry<Integer, String> ele : hm.entrySet()) {
			res.add(ele.getValue());
			// res.add(var);
		}
		Collections.sort(res); // sorting the values and returning a list
		return res;
	}
}
