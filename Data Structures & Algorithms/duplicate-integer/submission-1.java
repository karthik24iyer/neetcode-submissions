class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> occurenceSet = new HashSet<>();

        for(int num: nums) {
            if(occurenceSet.contains(num)) {
                return true;
            }
            occurenceSet.add(num);
        }
        return false;
    }
}