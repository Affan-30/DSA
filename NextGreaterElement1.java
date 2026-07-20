class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer, Integer> map = new HashMap<>();
       int i =0 ;
       int j = i+1;
       int max = -1;
        while(i < nums2.length){
            j = i + 1;
         while(j < nums2.length){
            if(nums2[j] > nums2[i]){
                max = nums2[j];
                break;
            }
            j++;
       }

       map.put(nums2[i], max);
       max = -1;
       i++;
       }

       for(int a=0; a<nums1.length; a++){
        nums1[a] = map.get(nums1[a]);
       }
      
        return nums1;
    }
}
