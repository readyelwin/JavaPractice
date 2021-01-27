
public class InstestingJavaProject {

	public static void main(String[] args) {
		class ReverseString {
			  public void helper(char[] s, int left, int right) {
			    if (left >= right) return;
			    char tmp = s[left];
			    s[left++] = s[right];
			    s[right--] = tmp;
			    helper(s, left, right);
			  }

			  public void reverseString(char[] s) {
			    helper(s, 0, s.length - 1);
			  }
			}
		// TODO Auto-generated method stub

	}

}
