class Solution {
    public boolean isPalindrome(int x) {
        String S = String.valueOf(x);
        int j=S.length()-1;
        for(int i=0;i<S.length()/2;i++){
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}