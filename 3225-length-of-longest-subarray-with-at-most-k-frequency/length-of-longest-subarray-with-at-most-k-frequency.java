class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
            if(map.get(nums[i])<k){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                ans=Math.max(ans,i-l+1);
            }else{
                while(l<nums.length && nums[l]!=nums[i]){
                    map.put(nums[l],map.get(nums[l])-1);
                    l++;
                }
                map.put(nums[i], map.get(nums[i]) - 1);
                l++;
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                ans=Math.max(ans,i-l+1);
                
            }
                

            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                ans=Math.max(ans,i-l+1);
            }


        }
        return ans;
        
    }
}