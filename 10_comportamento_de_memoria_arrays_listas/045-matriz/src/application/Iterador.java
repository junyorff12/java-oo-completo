package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterador {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
