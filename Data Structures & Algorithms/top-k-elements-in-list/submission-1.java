class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(Map.Entry<Integer,Integer> entry: count.entrySet()) {
            queue.add(new int[] {entry.getKey(), entry.getValue()});
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0;i<k;i++) {
            result[i] = queue.poll()[0];
        }

        return result;


    }
}
