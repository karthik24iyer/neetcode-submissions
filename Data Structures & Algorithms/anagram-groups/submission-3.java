class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> countMap= new HashMap<>();

        for(String str: strs) {  
            int[] hash = new int[26];          
            for(char c: str.toCharArray()) {
                hash[c-'a']++;
            }
            countMap.computeIfAbsent(Arrays.toString(hash), k -> new ArrayList<>()).add(str);
            
        }

        return new ArrayList<>(countMap.values());
    }
}
