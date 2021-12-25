package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class preJava8 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> tempList = new ArrayList<Integer>();
		
		intList.add(28);
		intList.add(-18);
		intList.add(0);
		intList.add(-28);
		intList.add(9);
		intList.add(18);
		intList.add(72);
		intList.add(18);
		intList.add(54);
		intList.add(-7);
		
		int sum = 0;
		for(Integer num : intList) {
			if(num%18==0 && !tempList.contains(num)) {
				sum += num;
				tempList.add(num);
			}
		}
		
		System.out.println(sum);
	}

}
