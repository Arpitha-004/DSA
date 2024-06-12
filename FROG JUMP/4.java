import java.util.* ;
import static java.lang.Math.abs;
public class 4 {
    public static int frogJump(int n, int heights[]) {
      int[] dp=new int[n];
      Arrays.fill(dp,-1);
     return solve(n-1,heights,dp);
    }
    public static int solve(int ind,int[] heights,int[] dp){
    if(ind==0) return 0;
    if(dp[ind]!=-1) return dp[ind];
    int jumpTwo = Integer.MAX_VALUE;
    int jumpOne= solve(ind-1, heights,dp)+ Math.abs(heights[ind]-heights[ind-1]);
    if(ind>1)
        jumpTwo = solve(ind-2, heights,dp)+ Math.abs(heights[ind]-heights[ind-2]);
    
    return dp[ind]=Math.min(jumpOne, jumpTwo);
}

}