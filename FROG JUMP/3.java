import java.util.* ;
import static java.lang.Math.abs;
public class 3 {
    public static int frogJump(int n, int heights[]) {
       
  int dp[]=new int[n];
  Arrays.fill(dp,-1);
  dp[0]=0;
  for(int s=1;s<n;s++){
      int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= dp[s-1] + Math.abs(heights[s]-heights[s-1]);
        if(s>1)
            jumpTwo = dp[s-2] + Math.abs(heights[s]-heights[s-2]);
    
        dp[s]=Math.min(jumpOne, jumpTwo);
  }
   return dp[n-1];
    }

}