class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // arr2 element -> its priority
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        // Separate elements according to whether
        // they are present in arr2
        for (int i = 0; i < arr1.length; i++) {

            if (map.containsKey(arr1[i])) {
                list.add(arr1[i]);
            }
        }

        // Sort the elements that are present in arr2
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));

        // Add remaining elements
        ArrayList<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            if (!map.containsKey(arr1[i])) {
                remaining.add(arr1[i]);
            }
        }

        // Remaining elements must be ascending
        Collections.sort(remaining);

        // Create answer
        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : list) {
            result[index++] = num;
        }

        for (int num : remaining) {
            result[index++] = num;
        }

        return result;
    }
}
