class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mpp = new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);

        int n=s.length();
        int result = mpp.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            if(mpp.get(s.charAt(i)) < mpp.get(s.charAt(i+1))){
                result-=mpp.get(s.charAt(i));
            }else{
                result+=mpp.get(s.charAt(i));
            }
        }
        return result;
    }
}