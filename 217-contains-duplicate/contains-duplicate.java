import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     boolean ans=false;
    //    Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++){
    //     if(nums[i]==nums[i-1]){
    //         ans=true;
    //     }
    //         }
    //     return ans;

    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
       if(map.containsKey(nums[i])){
        return true;
       }
       map.put(nums[i],1);
    }
    
    return false;
    }
}