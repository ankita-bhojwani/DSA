class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length-1;
        int min=1;
        int result=0;
        int max=position[n]-position[0];
        while(min<=max){
            int mid=(min+max)/2;
            boolean ans=isPossible(mid,position,m);
            if(ans){
                result=mid;
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return result;
    }

    public boolean isPossible(int mid,int[] position, int m){
        int count=1;
        int last=position[0];
        for(int i=0;i<position.length;i++){
if(position[i]-last>=mid){
    count++;
    last=position[i];
}
if(count>=m){
    return true;
}
        }
        return false;
    }
}