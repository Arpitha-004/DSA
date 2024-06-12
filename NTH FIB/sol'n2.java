public import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       int n=sc.nextInt();
	   int dp[]=new int[n+1];
	   Arrays.fill(dp,-1);
	   dp[0]=0;
	   dp[1]=1;
	   for(int i=2;i<=n;i++){
		   dp[i]=dp[i-1]+dp[i-2];
	   }
	   System.out.println(dp[n]);
	}

}
 {
    
}
