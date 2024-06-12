import java.util.* ;
import static java.lang.Math.abs;
public class 2 {
    public static int frogJump(int n, int heights[]) {
   int prev=0;
  int prev2=0;
  for(int i=1;i<n;i++){
      
      int jumpTwo = Integer.MAX_VALUE;
      int jumpOne= prev + Math.abs(heights[i]-heights[i-1]);
      if(i>1)
        jumpTwo = prev2 + Math.abs(heights[i]-heights[i-2]);
    
      int cur_i=Math.min(jumpOne, jumpTwo);
      prev2=prev;
      prev=cur_i;
        
  }
   return prev;
    }

}