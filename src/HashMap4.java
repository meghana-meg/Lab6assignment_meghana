/**
 * Author name : MEGHANA T
 * date: 05/11/2020 
 * desc: testing compilation and running to provide medals to students based on marks
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> input = new HashMap<Integer, Integer>();
		System.out.println("Enter the number of Students:");
		int n = sc.nextInt();
		sc.nextLine();
		int id, marks;
		for (int i = 0; i < n; i++) {
			id = sc.nextInt();
			marks = sc.nextInt();
			input.put(id, marks);

		}
		Map<Integer, String> result = new HashMap<Integer, String>();
		result = getStudents(input);
		System.out.println(result);
	}

	public static Map<Integer, String> getStudents(Map<Integer, Integer> input) {
		Map<Integer, String> result = new HashMap<Integer, String>();
		String medal = new String();
		for (Map.Entry<Integer, Integer> ele : input.entrySet()) {
			if (ele.getValue() >= 90) { // comparing the marks and setting maedals for each
				medal = "Gold";
				result.put(ele.getKey(), medal);

			} else if ((ele.getValue() >= 80 && ele.getValue() <= 90)) {
				medal = "Silver";
				result.put(ele.getKey(), medal);
			} else if ((ele.getValue() >= 70 && ele.getValue() <= 80)) {
				medal = "Bronze";
				result.put(ele.getKey(), medal);
			} else {
				medal = "No medal";
				result.put(ele.getKey(), medal);
			}
		}
		return result;
	}
}