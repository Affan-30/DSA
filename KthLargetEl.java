class Solution {
    public int findKthLargest(int[] arr, int k) {
        // 1. Sort in ascending order [1, 2, 3, 5, 9]
        Arrays.sort(arr);

        // 2. Reverse the array in-place
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

          return arr[k-1];
    }
}
