
public class DecodeWays {

	public static void main(String[] args) {
		
		class Solution {

		    HashMap<Integer, Integer> memo = new HashMap<>();

		    private int recursiveWithMemo(int index, String str) {

		        
		        if (index == str.length()) {
		            return 1;
		        }

		   
		        if (str.charAt(index) == '0') {
		            return 0;
		        }

		        if (index == str.length()-1) {
		            return 1;
		        }

		        if (memo.containsKey(index)) {
		            return memo.get(index);
		        }

		        int ans = recursiveWithMemo(index+1, str);
		        if (Integer.parseInt(str.substring(index, index+2)) <= 26) {
		             ans += recursiveWithMemo(index+2, str);
		         }

		       
		        memo.put(index, ans);

		        return ans;
		    }
		    public int numDecodings(String s) {
		        if (s == null || s.length() == 0) {
		            return 0;
		        }
		        return recursiveWithMemo(0, s);
		    }
		}
		// TODO Auto-generated method stub

	}

}
