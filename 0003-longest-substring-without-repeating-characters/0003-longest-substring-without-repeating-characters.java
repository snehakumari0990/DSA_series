class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(r = 0; r < s.length(); r++){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = map.get(s.charAt(r)) + 1;
            }
            map.put(s.charAt(r),r);
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}