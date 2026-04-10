class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int value=0;
        int dummy=n;
        int temp=0;
        while(n>0){
            value=n%10;
            n=n/10;
            temp=temp+(value*value*value);
        }
        if(dummy==temp){
            return true;
        }
        else{
            return false;
        }
    }
}