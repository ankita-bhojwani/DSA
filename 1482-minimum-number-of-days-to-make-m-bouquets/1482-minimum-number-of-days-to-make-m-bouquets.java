class Solution {
    public int minDays(int[] nums, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(max<nums[i]){
             max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int result=max;
        if((long)m*k>n){
            return -1;
        }
        while(min<=max){
            int mid= (min+max)/2;
           int b =isPossible(nums,k,mid);
            if(b>=m){
                result=mid;
                max=mid-1;
            }
            else if(b<m){
                min=mid+1;
            }
        }
return result;
    }

public int isPossible(int[] nums, int k,int mid){
        int counter=0;
   int b = 0;
   for(int i=0;i<nums.length;i++){
if(mid>=nums[i]){
counter++;
}
else{
     b+=counter/k;
    counter=0;
}
 
}
b+=counter/k;
return  b;
}
}
   