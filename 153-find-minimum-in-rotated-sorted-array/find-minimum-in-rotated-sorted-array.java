class Solution {
    public int findMin(int[] nums) {
        //this means array is not rotated so just return the 1st ele
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }else{
                h=mid;
            }
            
        }
        return nums[l];

    }
}