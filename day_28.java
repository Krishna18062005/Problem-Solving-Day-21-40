class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(evenDigit(nums[i])){
                c++;
            }
        }
        return c;
    }
    public static boolean evenDigit(int a){
        return ((int)Math.log10(a)+1)%2==0;
    }
}
