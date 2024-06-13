class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int max=-1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(a.get(nums[i])>nums.length/2){
                max=nums[i];
            }
        }
        return max;
        
    }
}
