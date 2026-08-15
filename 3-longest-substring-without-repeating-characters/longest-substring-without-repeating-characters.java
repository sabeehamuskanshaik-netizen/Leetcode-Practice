class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=0;
        while(l<=r && r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.get(s.charAt(r))>1){
                while(map.get(s.charAt(r))>1){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;
                }
            }
            r++;
            ans=Math.max(ans,r-l);
        }
        return ans;
        
    }
}