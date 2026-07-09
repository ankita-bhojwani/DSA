class Solution {
    public int splitArray(int[] arr, int k) {
         long min=0;
        long max=0;
    long sum=0;
    if (k > arr.length) {
    return -1;
}
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(arr[i]>max){
            max=arr[i];
        }
    }
    min=max;
    max=sum;
    int result=0;
    while(min<=max){
        long mid=(min+max)/2;
        int ans=isPossible(mid,arr,k);
        if(ans>k){
             min=mid+1;  
        }
        else{
          
           max=mid-1;
        }
    }
    return (int)min;
    }
    
    public int isPossible(long mid,int[] arr, int k){
        int count=1;
        long pages=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]+pages<=mid){
                 pages+=arr[i];
             }
             else{
                 count++;
                 pages=arr[i];
             }
        }
        return count;
    
    }
}