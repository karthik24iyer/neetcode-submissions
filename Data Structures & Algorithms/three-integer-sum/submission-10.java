class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // nums = [-1, -1, 0, 1, 2, 4]
        
        Set<List<Integer>> triplets = new HashSet<>();

        for(int i=0;i<nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;

            while(j<k) {
                if(nums[i]+nums[j]+nums[k]<0) {
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0) {
                    k--;
                }
                else {
                    triplets.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                }
            }

        }
        return new ArrayList(triplets);
    }
}
