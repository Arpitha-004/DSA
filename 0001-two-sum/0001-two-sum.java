class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) return null;
        if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                return new int[]{0, 1};
            }
            return null;
        }
        int pointer1 = 0, pointer2 = pointer1 + 1;
        while (nums.length > pointer1) {
            if (pointer2 >= nums.length) {
                pointer2 = ++pointer1 + 1;
                continue;
            }
            if (nums[pointer1] + nums[pointer2] == target) {
                return new int[]{pointer1, pointer2};
            }
            pointer2++;
        }
        return null;
    }
}