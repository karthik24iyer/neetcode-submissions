class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int j=numbers.length-1;
        if(i==j) {
            return new int[] {};
        }

        while(i!=j) {
            //System.out.println("i="+i+", j="+j);
            if(numbers[i]+numbers[j]<target) {
                i++;
            }
            else if (numbers[i]+numbers[j]>target) {
                j--;
            }
            else {
                return new int[] {i+1,j+1};
            }
            //System.out.println("numbers[i]="+numbers[i]+", numbers[j]="+numbers[j]);
        }
        return new int[]{};
    }
}