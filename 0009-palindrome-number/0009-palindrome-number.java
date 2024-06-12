class Solution {
    public boolean isPalindrome(int x) {
        String S = String.valueOf(x);
        int cnt=0,j=S.length()-1;
        for(int i=0;i<S.length()/2;i++){
            if(S.charAt(i)==S.charAt(j)){
                cnt++;
                j--;
            }
        }
        if(cnt==S.length()/2)
            return true;
        else 
            return false;
    }
}