import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DouDou
 * @create 10-Mar-2022 2:42 PM
 **/
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length < nums2.length){
            intersect(nums2,nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums1){
            int count =  map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        int[] ans = new int[nums2.length];
        int j =0;
        for(int i : nums2){
            int ccount = map.getOrDefault(i,0);
            if(ccount>0) {
                ans[j++] = i;
                ccount--;
                if (ccount > 0) {
                    map.put(i, ccount);
                } else {
                    map.remove(i);
                }
            }
        }
        return Arrays.copyOfRange(ans, 0, j);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,};
        int[] nums2 = {2,2,3};
        IntersectionofTwoArraysII ita = new IntersectionofTwoArraysII();
        int[] ans2 = ita.intersect(nums1, nums2);
        for(int i : ans2){
            System.out.println(i);
        }
    }
}
