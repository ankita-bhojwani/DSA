class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int low=1;
        long ans=0;
        int total=0;

    for(int i=0;i<piles.length;i++){
if(piles[i]>max){
    max=piles[i];
}
    }
    
    int high= max;

    while(low<=high){
int mid=(low+high)/2;
ans=canEat(piles,mid);
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

 public long canEat(int[] piles,int mid) {
    long totalhours=0;
    for(int i=0;i<piles.length;i++){
 totalhours += (piles[i] + (long)mid - 1) / mid;
    }
  
    return totalhours;
 }
}