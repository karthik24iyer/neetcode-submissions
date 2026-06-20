class Solution {

    private int binarySearch(int start, int end, int[] nums, int target) {
        int mid = (start + end) / 2;
        if(start>end) return -1;
        if(target==nums[mid]) {
            return mid;
        }
        
        return (target < nums[mid]) ? 
            binarySearch(start,mid-1,nums,target) :
            binarySearch(mid+1,end,nums,target);
        

    }

    public int search(int[] nums, int target) {
        return binarySearch(0,nums.length-1, nums, target);
    }
}
