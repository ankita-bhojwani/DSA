class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        int min=1;
        for(int i=0;i<nums.length;i++){
if(nums[i]>max){
max=nums[i];
        }
        }
        int ans=0;
        int result=0;
while(min<=max){
    int mid=(min+max)/2;
    ans=isPossible(nums,mid);
    if(ans<=threshold){
         result= mid;
        max=mid-1;
    }
    else if(ans>threshold){
        min=mid+1;
    }
    }
    return result;
    }

    public int isPossible(int[] nums, int mid){
        int div=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
div= (int)Math.ceil((double)nums[i]/mid);
ans+=div;
        }
        return ans;
    }
}