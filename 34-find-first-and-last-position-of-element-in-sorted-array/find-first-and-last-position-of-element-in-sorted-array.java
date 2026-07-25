class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int left=-1;
        int right=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                left=mid;
                h=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        l=0;
        h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                right=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return new int[]{left,right};
        
    }
}