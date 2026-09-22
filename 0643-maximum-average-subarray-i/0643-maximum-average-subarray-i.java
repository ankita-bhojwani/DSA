class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double result=Integer.MIN_VALUE;
    double ave =0;
    int left=0;
    double sum=0;
    
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
       sum+=nums[i];

        if(i-left+1==k){
            ave=sum/k;
            result=Math.max(ave,result);
            sum-=nums[left];
            left++;
        }
    } 
    return result;   
    }
}