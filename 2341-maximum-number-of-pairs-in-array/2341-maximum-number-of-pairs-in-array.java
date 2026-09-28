class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
            if(map.get(num) == 2){
                pairs++;
                map.put(num, 0);
            }
        }

        return new int[]{pairs, nums.length-2*pairs};
    }
}