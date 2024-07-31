class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;//3
        int xor1 = 0,xor2=0;
        for(int i=0;i<N;i++){
            xor2 = xor2 ^ nums[i];//0^3^0^1
            xor1 = xor1 ^ (i+1);//0^1^2^3
            /* Don't bother about o/p in each step we anyway don't want that no.Even if some no. forms at the end of xor1 & xor2 pc would have it*/
        }
        /*(0^3^0^1)^(0^1^2^3) = (0^0)^(3^3)^(1^1)^(0^2) = (0^0)^(0^2) = 0^2 = 2 ie,a^a=0 and a^0=0^a=a (order doesn't matter as all are ^ ).*/
        return (xor1 ^ xor2);
    }
}