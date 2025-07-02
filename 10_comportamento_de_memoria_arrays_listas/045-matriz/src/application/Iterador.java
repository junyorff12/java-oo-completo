package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterador {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
