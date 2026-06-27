class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) {
            return 0;
        }

        int len=0;
        int maxLen=0;
        Set<Character> chars = new HashSet<>();
        Map<Character,Integer> charIndex = new HashMap<>();
        
        // str = heloworlds
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            System.out.println();
            //System.out.println("top: i="+i+", c="+c+", len="+len);
            if(!chars.contains(c)) {
                chars.add(c);
                charIndex.put(c,i);
                len++;
                //System.out.println("if: i="+i+", c="+c+", len="+len);
            }
            else {
                maxLen=Math.max(len,maxLen);
                i=charIndex.get(c);
                len=0;
                chars.clear();
                charIndex.clear();
                //System.out.println("else: i="+i+", c="+c+", len="+len);
            }
        }

        return Math.max(len,maxLen);
    }
}
