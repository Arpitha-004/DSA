class Solution {
    public static boolean check(int[] nums) {
       int n = nums.length;
       boolean isIncrease = true;
       int pivot = 0;


       for(int i =1; i<n; i++){
           if(nums[i-1]> nums[i]){
               pivot = i;
               isIncrease = false;
               break;
           }
       }
        if(isIncrease){
            return true;
        }

       int rotation = n - pivot;
       int newArray[] = new int[n];
       
       for(int i = 0; i <n; i++){
           newArray[(i+ rotation)%n] = nums[i];
       }

       for(int i=1; i<n; i++){
           if(newArray[i] < newArray[i-1]){
               return false;
           }
       }
       return true;
    }
    public static void main(String args[]){
        int[] nums={3,3,1,2,3};
        System.out.println(check(nums));
    }
}