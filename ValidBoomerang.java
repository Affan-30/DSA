class Solution {
    public boolean isBoomerang(int[][] points) {
        
        int[] a = points[0];
        int[] b = points[1];
        int[] c = points[2];

        int x1 = a[0];
        int x2 = b[0];
        int x3 = c[0];

        int y1 = a[1];
        int y2 = b[1];
        int y3 = c[1];



        int area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area != 0;
    }
}
