class Solution {
    public int maxArea(int[] height) {
        int maxWater=0, rp=height.length-1, lp=0;
  while(lp<rp){
int width=rp-lp;
int h= Math.min(height[lp],height[rp]);
int area= width*h;
maxWater=Math.max(maxWater,area);
if(height[lp]<height[rp]){
    lp++;
}
else{rp--;
}
  }
  return maxWater;
    }
}