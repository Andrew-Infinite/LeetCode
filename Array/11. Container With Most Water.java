class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int maxArea=0;
        while(lo<hi){
            int h = (height[lo]<height[hi]) ? height[lo]:height[hi];
            int Area = h*(hi-lo);
            maxArea = (Area>maxArea) ? Area:maxArea;
            if(height[lo]<height[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return maxArea;
    }
}