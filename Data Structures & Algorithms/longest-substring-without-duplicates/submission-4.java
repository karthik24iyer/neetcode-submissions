class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) {
            return 0;
        }

        int len=0;
        int maxLen=0;
        Set<Character> chars = new HashSet<>();
        Map<Character,Integer> charIndex = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
        
            if(!chars.contains(c)) {
                chars.add(c);
                charIndex.put(c,i);
                len++;
            }
            else {
                maxLen=Math.max(len,maxLen);
                i=charIndex.get(c);
                len=0;
                chars.clear();
                charIndex.clear();
            }
        }

        return Math.max(len,maxLen);
    }
}
