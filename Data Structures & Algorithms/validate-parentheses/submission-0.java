class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        if(brackets.containsKey(s.charAt(0))) {
            return false;
        }

        for(char c: s.toCharArray()) {
            if(brackets.containsValue(c)) {
                stack.push(c);
            }
            else if(brackets.containsKey(c)) {
                if(stack.isEmpty() || brackets.get(c)!=stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}