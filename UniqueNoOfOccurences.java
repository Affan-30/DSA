class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //   entry.getValue();
        // }

        boolean allUnique = new HashSet<>(map.values()).size() == map.size();


        return allUnique;
    }
}
