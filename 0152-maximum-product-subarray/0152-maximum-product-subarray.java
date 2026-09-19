class Solution {
    public int maxProduct(int[] nums) {
        int Maxprod = nums[0];
        int Minprod=nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
                 int oldMax = Maxprod;
            int oldMin = Minprod;
            Maxprod = Math.max(nums[i],Math.max(oldMax*nums[i],oldMin*nums[i]));
            Minprod= Math.min(nums[i],Math.min(oldMax*nums[i],oldMin*nums[i]));
            max= Math.max(max,Maxprod);
        }
        return max;
    }
}