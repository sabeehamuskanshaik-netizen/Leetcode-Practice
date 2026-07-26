class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pref[]=new int[nums.length];
        int suff[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int pre=1;
        int suf=1;
        for(int i=0;i<nums.length;i++){
            pref[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            suff[i]=suf;
            suf=suf*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pref[i]*suff[i];
        }
        return ans;
    }
}