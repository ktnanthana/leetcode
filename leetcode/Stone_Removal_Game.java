class Solution {
    public boolean canAliceWin(int n) {
        boolean alice = false;
        int num = 10;
        while(n>=num){
            if(num%2==0){
                alice = true;
            }
            else{
                alice = false;
            }
            n = n - num;
            num--;
        }
        return alice;
    }
}