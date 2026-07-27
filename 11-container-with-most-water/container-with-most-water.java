import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int n=height.length;
    
        int l=0;
        int r=n-1;
       while(l<r){
        int width=r-l;
        int hei=Math.min(height[l],height[r]);
        ans=Math.max(ans,(width*hei));
        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
       }
        return ans;
        
    }
}