class Solution {
    public int singleNumber(int[] nums) {
        int N = nums.length;//5 
        int XOR = 0;
        for(int i=0;i<N;i++){
            XOR = XOR ^ nums[i];//4^1^2^1^2 
        }
        return XOR;/*(4)^(1^1)^(2^2) = 4^0^0 = 4^0 = 4 check out missing no. problem for expl'n.*/
    }
}