class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> occurence = new HashMap<>();

        for(char c: s.toCharArray()) {
            occurence.put(c,occurence.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()) {
            occurence.put(c,occurence.getOrDefault(c,0)-1);
        }

        for(int value : occurence.values()) {
            if(value!=0) {
                return false;
            }
        }
        return true;
    }
}
