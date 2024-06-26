class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        int[] ans = new int[2];
        Arrays.sort(temp);
        int i = 0, j = temp.length - 1;
        while(i <= j){
            if(temp[i] + temp[j] > target)    j--;
            else if(temp[i] + temp[j] < target)    i++;
            else    break;
        }
        int first_no = temp[i], second_no = temp[j];
        int ctr = 0;
        for(int k = 0; k < nums.length; k++){
            if(nums[k] == first_no && ctr == 0){   ans[0] = k;   ctr++;}
            else if(nums[k] == second_no)    ans[1] = k;
        }
        return ans;
    }
}