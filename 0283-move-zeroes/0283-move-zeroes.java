class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;

        // Find the index of the first zero
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, print the array and return
        if (j == -1) {
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
            return;
        }

        // Move non-zero elements to the front
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
