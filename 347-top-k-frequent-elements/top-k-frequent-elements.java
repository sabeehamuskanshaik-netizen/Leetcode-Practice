class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>[] buck=new ArrayList[nums.length+1];
        for(int i=0;i<buck.length;i++){
            buck[i]=new ArrayList<>();
        }
        int ans[]=new int[k];
        int idx=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            buck[freq].add(key);
        }
          for(int i=buck.length-1;i>=0 && idx<k;i--){
        for(int j=0;j<buck[i].size() && idx<k;j++){
         ans[idx++]=buck[i].get(j);
        }
     }
     return ans;
        
    }
}