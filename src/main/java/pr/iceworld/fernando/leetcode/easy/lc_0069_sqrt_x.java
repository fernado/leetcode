package pr.iceworld.fernando.leetcode.easy;

/**
 * 这个方法叫 牛顿迭代法（牛顿法），专门用来求平方根，比二分法还快！
 * 公式就是：下一个猜测值 = (当前猜测值 + x÷ 当前猜测值) ÷ 2反复算几次，就会无限接近真实平方根
 */
public class lc_0069_sqrt_x {


    static class Solution {
        public int mySqrt(int x) {
            
            if (x == 0) {
                return 0;
            }
            double guess = x;
            double prevGuess = 0.0;
            while (guess != prevGuess) {
                prevGuess = guess;
                guess = (guess + x / guess) / 2;
            }
            return (int) guess;
        }
    }

    public static void main(String[] args) {

        var s = new Solution();
        System.out.println(s.mySqrt(4));
        System.out.println(s.mySqrt(6));
        System.out.println(s.mySqrt(8));
        System.out.println(s.mySqrt(16));
    }
}
