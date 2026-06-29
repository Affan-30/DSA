class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count= 0;
        Arrays.sort(g);
        Arrays.sort(s);
       int child = 0;
       int cookie =0;

       while(child < g.length && cookie < s.length){
        if( s[cookie] >= g[child] ){
            count++;
            cookie++;
            child++;
        }else{
            cookie++;
        }
       }
        return count;
    }
}
