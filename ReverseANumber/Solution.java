class Solution {
    public int reverseDigits(int n){
        // Code here
        int rev=0;
        int value=0;
        while(n>0){
            value=n%10;
            n=n/10;
            rev=rev*10+value;
        }
        return rev;
    }
}