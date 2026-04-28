class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int res=0;
        while(i<j){
            int minht=Math.min(height[i],height[j]);
            int width=j-i;
            int vol=minht*width;
            res=Math.max(res,vol);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return res;
    }
}