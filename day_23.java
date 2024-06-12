class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1]&&nums[0]==nums[2]){
            return "equilateral";
        }
        
        int[] a=nums;
        if(a[0]+a[1]<=a[2]) return "none";
        else if(a[1]+a[2]<=a[0]) return "none";
        else if(a[2]+a[0]<=a[1]) return "none";
        if(nums[0]==nums[1]||nums[0]==nums[2]||nums[1]==nums[2]) return "isosceles";
        return "scalene";
    }
}
