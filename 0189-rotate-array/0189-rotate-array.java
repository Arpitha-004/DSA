class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0)
            return;
        k=k % n;
        if(k>n)
            return;
        Reverse(nums,0,n-k-1);
        Reverse(nums,n-k,n-1);
        Reverse(nums,0,n-1);
    }
    public void Reverse(int[] nums,int s,int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}