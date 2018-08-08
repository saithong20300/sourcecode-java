import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCF {

	public static void main(String[] args) {
		
		Map<String, Integer> emp = new HashMap<>();
		emp.put("chalermchat", 30);
		emp.put("now", 30);
		emp.put("now", 20);
		System.out.println(emp.get("chalermchat"));
		System.out.println(emp.get("now"));
		if (!emp.containsKey("xxx")) {
			System.out.println("Key not Found");
		}
		
		Set<String> keys= emp.keySet();
		for (String k: keys) {
			System.out.printf("%s -> %d\n",k, emp.get(k));
		}
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers.length);
		for (int i : numbers) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		// List :: dynamic array
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		int size = numberList.size();
		System.out.println("Size : "+size);

		for (Integer integer : numberList) {
			System.out.print(integer + ",");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print(numberList.get(i)+",");
		}
	}

}
