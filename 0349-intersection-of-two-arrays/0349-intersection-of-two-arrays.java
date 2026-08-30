class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i: nums1){
            s1.add(i);
        }
        for(int j : nums2){
            if(s1.contains(j)){
                s2.add(j);
            }
        }

        int[] arr = new int[s2.size()];
        int y = 0;
        for(int n : s2){
            arr[y++] = n;
        }
        return arr;
    }
}