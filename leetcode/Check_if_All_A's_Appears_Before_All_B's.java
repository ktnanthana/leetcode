class Solution {
    public boolean checkString(String s) {
        boolean res = true;
        int start = 0;
        while(start+1 < s.length()){
            if(s.charAt(start)=='b' && s.charAt(start+1)=='a')
            return false;
            start++;
        }
        return res; 
    }
}