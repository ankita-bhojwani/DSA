class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smaller=nums1.length>nums2.length?nums2:nums1;
        int[] larger=nums1.length>nums2.length?nums1:nums2;
        int totalLength=nums1.length+nums2.length;
        int low=0;
        int high=smaller.length;

        while(low<=high){
int midX=(low+high)/2;
int midY=(totalLength+1)/2-midX;
int l1=midX==0?Integer.MIN_VALUE:smaller[midX-1];
int r1=midX==smaller.length?Integer.MAX_VALUE:smaller[midX];
int l2=midY==0?Integer.MIN_VALUE:larger[midY-1];
int r2=midY==larger.length?Integer.MAX_VALUE:larger[midY];

if(l1<=r2 && l2<=r1){
    if(totalLength%2==0){
        return ((double)Math.max(l1,l2)+Math.min(r1,r2))/2.0;
    }
    else{
        return((double)Math.max(l1,l2));
    }
}
else if(l1>r2){
    high=midX-1;
}
else{
    low=midX+1;
}
        }
        return 0;
    }
}