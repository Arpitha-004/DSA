import java.util.*;
public class sol'n{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       int n=sc.nextInt();
	  int  prev2=0;
	  int prev=1;
	   for(int i=2;i<=n;i++){
		int   cur=prev2+prev;
           prev2=prev;
		   prev=cur;
	   }
	   System.out.println(prev);
	}

}
