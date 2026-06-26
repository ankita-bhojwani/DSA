class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int low=1;
        int ans=0;
        int total=0;

    for(int i=0;i<piles.length;i++){
if(piles[i]>max){
    max=piles[i];
}
    }
    
    int high= max;

    while(low<=high){
int mid=(low+high)/2;
ans=power(piles,mid,h);
if(ans<=h){
    total=mid;
    high=mid-1;
}
else{
    low=mid+1;
}
    }
     return total;
    }

 public int power(int[] piles,int mid, int h) {
    int totalhours=0;
    for(int i=0;i<piles.length;i++){
  totalhours+=Math.ceil((double)piles[i]/mid);
    }
  
    return totalhours;
 }
}