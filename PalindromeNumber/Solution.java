class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int value=0;
        int num=0;
        int dummy=n;
        while(n>0 || n<0){
            value=n%10;
            n=n/10;
            num=num*10+value;
        }
        if(dummy==num){
            return true;
        }
        else{
            return false;
        }
    }
}