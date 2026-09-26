class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == '?') {
                for (char c = 'a'; c <= 'c'; c++) {
                    // Check left neighbor
                    boolean prevMatch = (i > 0 && arr[i - 1] == c);
                    // Check right neighbor
                    boolean nextMatch = (i + 1 < n && arr[i + 1] == c);
                    
                    if (!prevMatch && !nextMatch) {
                        arr[i] = c;
                        break;
                    }
                }
            }
        }
        
        return new String(arr);
    }
}
