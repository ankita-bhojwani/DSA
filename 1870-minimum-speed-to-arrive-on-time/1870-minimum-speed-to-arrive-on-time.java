class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int min=1;
        int max= 10000000;
         double ans=0;
         int result=-1;
        while(min<=max){
            int mid=(min+max)/2;
             ans= isPossible(mid,dist,hour);
            if(ans<=hour){
                result=mid;
                 max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        
        return result;
            
    }

public double isPossible(int speed, int[] dist, double hour){
    double t=0;
    for(int i=0;i<dist.length;i++){
        if(i!=dist.length-1){
t+=Math.ceil((double)dist[i]/speed);
        }
        else{
            t+=(double)dist[i]/speed;
        }

    }
    return t;
}

}