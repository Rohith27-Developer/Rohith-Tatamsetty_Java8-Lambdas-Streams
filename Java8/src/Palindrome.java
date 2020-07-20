import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Palindrome {
	public static void main(String[] args) {
		List<String> al=Arrays.asList("racecar","madam","level","hello","abc");
			palindrome(al,CheckPalindrome::check).forEach(System.out::println);
		}
	static List<String> palindrome(List<String> list, Predicate<String> myPredicate) {
			return list.stream().filter(str -> myPredicate.test(str)).collect(Collectors.toList());
		}
}
