class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            int moreNeed=target-curr;
            if(mpp.containsKey(moreNeed)){
                ans[0]=mpp.get(moreNeed);
                ans[1]=i;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums,target);
        System.out.println("index:["+ans[0]+","+ans[1]+"]");
    }
}