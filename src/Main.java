public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n <= 2){
            return n;
        }
        int[] dp = new int[n+1]; // if 5 stairs, wee need 6 indexes since since 0
        dp[1] = 1; // assigned by performing first two places logically
        dp[2] = 2;

        for (int i =3; i <dp.length; i++ ){ // start at 3 since 1 and 2 assigned
            dp[i] = dp[i-1] + dp[i-2]; // example, dp[5] = 5 + 3 = 8
        }
        return dp[n];
    }
}

// fib sequnce: 1,2,3,5,8,13,21, etc.
