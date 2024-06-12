import java.util.* ;
import static java.lang.Math.abs;
public class Solution {
    public static int frogJump(int n, int heights[]) {
       int s=heights.length;
  int dp[]=new int[s];
  Arrays.fill(dp,-1);
  dp[0]=0;
  for(n=1;n<s;n++){
      int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= dp[n-1] + Math.abs(heights[n]-heights[n-1]);
        if(n>1)
            jumpTwo = dp[n-2] + Math.abs(heights[n]-heights[n-2]);
    
        dp[n]=Math.min(jumpOne, jumpTwo);
  }
   return dp[s-1];
    }

}