class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
      return ans;
        
    }
    public static void main(String args[]){
        int[] nums={2,6,5,8,11};
        int target=14;
        int[] ans=twoSum(nums,target);
        System.out.println("index:["+ans[0]+","+ans[1]+"]");

    }
}