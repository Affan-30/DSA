class Solution {
    public List<String> stringMatching(String[] words) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String str = words[i];

            for (int j = 0; j < words.length; j++) {
                String s = words[j];

                if (!str.equals(s) && str.contains(s)) {
                    set.add(s);
                }
            }
        }

        return new ArrayList<>(set);
    }
}
