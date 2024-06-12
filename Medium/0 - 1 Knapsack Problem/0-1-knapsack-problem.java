//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends




class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int f[][] = new int[n+1][W+1];
         for(int i=0;i<=n;i++){
             for(int j=0;j<=W;j++){
                f[i][j] = -1;
             }
         }
         return mfk(n, W, wt, val, f);
    } 
    
     public static int mfk(int i, int j, int[] wt, int[] val, int[][] f) {
        // Base case: no items or no capacity
        if (i == 0 || j == 0) {
            return 0;
        }
        
        // If subproblem already computed, return the stored value
        if (f[i][j] != -1) {
            return f[i][j];
        }
        
        // If weight of the current item is more than the current capacity,
        // skip this item
        if (wt[i - 1] > j) {
            f[i][j] = mfk(i - 1, j, wt, val, f);
        } else {
            // Compute the maximum value by including or excluding the current item
            f[i][j] = Math.max(
                mfk(i - 1, j, wt, val, f),
                val[i - 1] + mfk(i - 1, j - wt[i - 1], wt, val, f)
            );
        }
        
        return f[i][j];
    }
}


