import java.util.*;
public class Average {
	static double calculateAverage(List<Integer> numbers){
		return numbers.stream().mapToInt(i -> i).average().getAsDouble();   
	}
	public static void main(String[] args){
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numbers.add(i);
		}
		double average=calculateAverage(numbers);
		System.out.println("The average for given numbers is : "+average);
	}

}
