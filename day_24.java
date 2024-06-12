class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int y=x;
        while(x>0){
            s=s+x%10;
            x/=10;
        }
        return (y%s==0)?s:-1;
    }
}
