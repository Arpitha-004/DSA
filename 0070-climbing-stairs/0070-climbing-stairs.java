/* Solution {
    public int climbStairs(int n) {
        //returns number of ways to reach n'th stairs
      return countways(n+1);
    }
    public int countways(int s){
        if(s<=1)
         return s;
        return countways(s-1) + countways(s-2);
    }
    
}*/
class Solution {
    public int climbStairs(int n) {
        if (n <= 1)
            return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
