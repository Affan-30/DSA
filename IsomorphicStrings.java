class Solution {
    public boolean isIsomorphic(String s, String t) {
          if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Maps to track character pairs in both directions
        HashMap<Character, Character> forwardMap = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check forward mapping: charS -> charT
            if (forwardMap.containsKey(charS)) {
                if (forwardMap.get(charS) != charT) {
                    return false; // Different pair for an existing key found
                }
            } else {
                forwardMap.put(charS, charT);
            }

            // Check reverse mapping: charT -> charS
            if (reverseMap.containsKey(charT)) {
                if (reverseMap.get(charT) != charS) {
                    return false; // Two different keys mapping to same value
                }
            } else {
                reverseMap.put(charT, charS);
            }
        }

        return true;
    }
}
