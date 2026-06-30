class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       int left=0;
       long sum=0;
       long maxi=Integer.MIN_VALUE;
       HashMap<Integer,Integer> map= new HashMap<>();
    for(int right=0;right<nums.length;right++){
map.put(nums[right],map.getOrDefault(nums[right],0)+1);
sum+=nums[right];
while(map.get(nums[right])>1){
    map.put(nums[left],map.get(nums[left])-1);
    sum-=nums[left];
    left++;
}
if(right-left+1 == k){
maxi=Math.max(maxi,sum);
map.put(nums[left],map.get(nums[left])-1);
if(map.get(nums[left])==0){
    map.remove(nums[left]);
}
sum-=nums[left];
left++;
}
    }
    if(maxi==Integer.MIN_VALUE){
        return 0;
    }
    return maxi;
    }
}