class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        //int s=0, start=-1,end=-1;
        for(int i=0;i<nums.length;i++){
           /* if(sum == 0) 
                s = i;
            */
            sum += nums[i];

            if(sum > max){
                max = sum;
            /*    start = s;
                end = i; */
            }

            if(sum < 0){
                sum = 0;
            }
        }
       /* for(int i=start;i<=end;i++)
            System.out.print(nums[i]+" ");
        */
        return max;
    }
}