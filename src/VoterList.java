/**
 * Author name : MEGHANA T 
 * date: 05/11/2020 
 * desc: testing compilation and running to predict the voters list based on date of birth
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import java.util.ParseException;

public class VoterList {
	public static void main(String[] args) throws java.text.ParseException {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			String dob = sc.next();
			// String s = "1994/06/23";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date d = sdf.parse(dob);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH) + 1;
			int date = c.get(Calendar.DATE);
			LocalDate l1 = LocalDate.of(year, month, date);
			LocalDate now1 = LocalDate.now();
			Period diff1 = Period.between(l1, now1);
			int age = diff1.getYears();
			hm.put(id, age);

		}

		List<Integer> list = new ArrayList<>();
		list = votersList(hm);
		System.out.println(list);
	}

	public static List<Integer> votersList(Map<Integer, Integer> hm) {
		List<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> ele : hm.entrySet()) { // checking whether the person's age is >18
			if (ele.getValue() > 18)
				result.add(ele.getKey());
		}
		return result;

	}

}
