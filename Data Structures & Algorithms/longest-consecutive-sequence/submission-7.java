class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        if(nums.length<2) {
            return nums.length;
        }

        // nums = -1,-1,0,1,3,4,5,6,7,8,9
        int left=0, right=1;
        int count=1;
        int maxCount=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) {
                continue;
            }
            if(nums[i]-nums[i-1]==1) {
                count++;
            }
            else {
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }

        return Math.max(maxCount,count);
    }
}
