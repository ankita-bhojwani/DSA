class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n= weights.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum+=weights[i];
        }
        int left=max;
        int result=0;
        int right=sum;
        while(left<=right){
            int mid=(left+right)/2;
            int d= capacity(weights,days,mid);
            if(d<=days){
                result=mid;
                right=mid-1;
                
            }
            else if(days<d){
                left=mid+1;
            }
           
        }
        return result;
    }

    public int capacity(int[] weights, int days,int mid){
      int d=1; 
      int sum=0; 
        for(int i=0;i<weights.length;i++){
if(weights[i]+sum<=mid){
    sum+=weights[i];
}
else{
    sum=0;
    d++;
    sum+=weights[i];
}
       
    }
     return d;
}
}