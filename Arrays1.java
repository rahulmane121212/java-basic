package ArraysAndArrayList.practice;

import java.util.ArrayList;

public class Arrays1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		
		for(int i=0; i<numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}

	}

}
