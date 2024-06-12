import java.util.*;
public class sol{

    static int f(int n,int[] dp){
		if(n<=1)
		 return n;
		if(dp[n]!=-1)
		 return dp[n];
		return dp[n]=f(n-1,dp)+f(n-2,dp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       int n=sc.nextInt();
	   int dp[]=new int[n+1];
	   Arrays.fill(dp,-1);
	   System.out.println(f(n,dp));
	}

}
import java.util.*;
public class Solution {

    static int f(int n,int[] dp){
		if(n<=1)
		 return n;
		if(dp[n]!=-1)
		 return dp[n];
		return dp[n]=f(n-1,dp)+f(n-2,dp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       int n=sc.nextInt();
	   int dp[]=new int[n+1];
	   Arrays.fill(dp,-1);
	   System.out.println(f(n,dp));
	}

}
