class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indiceMap = new HashMap<>();
        
        for(int i=0; i<nums.length;i++) {
            int complement = target - nums[i];

            if(indiceMap.containsKey(complement) && i!=indiceMap.get(complement)) {
                if(i<indiceMap.get(complement)) {
                    //return new int[] {i, indiceMap.get(complement)};
                }
                return new int[] {indiceMap.get(complement),i};
            }

            indiceMap.put(nums[i],i);
        }

        return new int[]{};
    }
}