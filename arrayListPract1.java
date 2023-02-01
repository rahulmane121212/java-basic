package ArraysAndArrayList.practice;

import java.util.ArrayList;

public class arrayListPract1 {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<String>();
		car.add("Baleno");
		car.add("Swift");
		car.add("wagonR");
		
		for(int i=0; i<car.size(); i++)
		{
			System.out.println(car.get(i));
		}

	}

}
