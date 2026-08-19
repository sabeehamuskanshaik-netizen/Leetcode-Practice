class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr+=nums[i];
            curr=Math.max(curr,nums[i]);
            ans=Math.max(curr,ans);
        }
        return ans;
        
    }
}