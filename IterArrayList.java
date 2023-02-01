package ArraysAndArrayList.practice;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IterArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,2,5,1,3);
		
		//Iterator it = (Iterator) numbers.iterator();
		numbers.forEach(number->System.out.println(number));

}
}
