class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        // Count required letters from licensePlate
        int[] required = new int[26];

        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                required[c - 'a']++;
            }
        }

        String answer = "";

        for (String word : words) {

            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            // Check whether word contains all required letters
            boolean valid = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] < required[i]) {
                    valid = false;
                    break;
                }
            }

            // Update shortest word
            if (valid && (answer.equals("") || word.length() < answer.length())) {
                answer = word;
            }
        }

        return answer;
    }
}
