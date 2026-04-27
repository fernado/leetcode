package pr.iceworld.fernando.leetcode.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class lc_0067_add_binary {

    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0 || carry == 1) { 
                int sum = carry;
                if (i >= 0) sum += a.charAt(i) - '0';
                if (j >= 0) sum += b.charAt(j) - '0';
                sb.append(sum % 2);
                carry = sum / 2;
                i--;
                j--;
            }
            return sb.reverse().toString();

        }
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        var s = new Solution();
        System.out.println(s.addBinary(a, b));

        a = "1010";
        b = "1011";
        System.out.println(s.addBinary(a, b));
    }
}