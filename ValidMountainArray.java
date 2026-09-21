class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        
        int i = 0;
        int n = arr.length;

        // 1. Climb up the mountain
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // 2. The peak cannot be the first or the last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // 3. Climb down the mountain
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // 4. If we successfully reached the very end, it's a valid mountain
        return i == n - 1;
    }
}
