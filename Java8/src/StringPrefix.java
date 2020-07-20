import java.util.*;
import java.util.stream.Collectors;
public class StringPrefix {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("antony","alex","rohith","dheeraj","abc","acd","bcd");
		prefix(names).forEach(System.out::println);
	}

static List<String> prefix(List<String> list) {
		return list.stream().filter(s->(s.length()==3 && s.startsWith("a"))).collect(Collectors.toList());
	}
}
