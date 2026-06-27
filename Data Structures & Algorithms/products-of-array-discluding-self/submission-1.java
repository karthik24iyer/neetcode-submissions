class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftProduct = new int[len];
        int[] rightProduct = new int[len];
        int[] result = new int[len];

        leftProduct[0]=nums[0];
        rightProduct[len-1]=nums[len-1];

        for(int i=1;i<len;i++) {
            leftProduct[i]=nums[i]*leftProduct[i-1];
        }

        for(int i=len-2;i>=0;i--) {
            rightProduct[i]=nums[i]*rightProduct[i+1];
        }

        result[0]=rightProduct[1];
        result[len-1]=leftProduct[len-2];
        for(int i=1;i<len-1;i++) {
            result[i]=leftProduct[i-1]*rightProduct[i+1];
        }

        return result;
    }
}  
