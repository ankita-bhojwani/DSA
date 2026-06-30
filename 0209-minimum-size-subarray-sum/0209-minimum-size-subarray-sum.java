class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int mini=Integer.MAX_VALUE;
        int sum=0;
        if(target<1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
sum+=nums[i];
while(sum>=target){
    mini=Math.min(mini,i-left+1);
    sum-=nums[left];
    left++;
}
        }
        if(mini==Integer.MAX_VALUE){
            return 0;
        }
        
        return mini;
    }
}