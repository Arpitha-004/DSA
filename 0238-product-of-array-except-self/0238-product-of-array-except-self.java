class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[] = new int[n];
        answer[0] = 1;
        for(int i=1;i<n;i++){
            answer[i] = answer[i-1] * nums[i-1];//ans[1]=ans[0]*nums[0]=1*1 1*2 2*3
        }
        int rt=1;
        for(int i=n-1;i>=0;i--){
            answer[i] = answer[i] * rt;//6*1 2*4 1*12 1*24 (final answer)
            rt = rt * nums[i];//1*4 4*3 12*2 24*1
        }
        return answer;
    }
}