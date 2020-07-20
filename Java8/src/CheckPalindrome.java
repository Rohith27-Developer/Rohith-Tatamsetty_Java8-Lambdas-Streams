
public class CheckPalindrome {
		public static boolean check(String str) {
			return str.equals(new StringBuffer(str).reverse().toString());
		}
}
