class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        // copy non-zero elements
        // from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                temp.add(nums[i]);
        }

        // copy elements from temp
        // fill first nz fields of
        // original array:
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        // fill rest of the cells with 0:
        for (int i = temp.size(); i < n; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}