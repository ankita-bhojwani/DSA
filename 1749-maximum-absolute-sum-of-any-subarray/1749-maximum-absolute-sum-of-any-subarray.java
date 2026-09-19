class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int sum=0;
        int max=nums[0];
        int min=nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        sum=0;
        for(int i=0;i<nums.length;i++){
             sum=Math.min(nums[i],sum+nums[i]);
            min=Math.min(min,sum);
        }
        ans=Math.max(Math.abs(max),Math.abs(min));
return ans;
    }
}