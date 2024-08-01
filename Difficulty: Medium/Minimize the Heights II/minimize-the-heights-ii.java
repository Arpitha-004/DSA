//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);                   //1,5,8,10
        int ans = arr[n-1] - arr[0];        //10-1=9
        
// there can be arr [1,1,1,1] then min diff does not change as it wl be 0 (shouldn't contain -ve) 
        
        int s = arr[0] + k;                 //1+2=3
        int l = arr[n-1] - k;               //10-2=8
        int mi=0,ma=0;
        
        for(int i=0;i<n-1;i++){                 //n-1 bcuz mi takes arr[i+1]
            mi = Math.min(s , arr[i+1]-k);  //(3,5-2)=3 | (3,8-2)=3 | (3,10-2)=3
            ma = Math.max(l , arr[i]+k);    //(8,1+2)=8 | (8,5+2)=8 | (8,8+2)=10
            
            if(mi<0)    continue;
            
            ans = Math.min(ans , ma-mi);    //(9,8-3)=5 | (5,8-3)=5 | (5,10-3)=5
        }
        return ans;
    }
}
