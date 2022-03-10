/**
 * @author DouDou
 * @create 10-Mar-2022 12:59 PM
 **/
public class MergeSortedArray {
//0ms,memory:42,9MB
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if(m==0){
//            for(int i =0; i < n; i++)
//                nums1[i]=nums2[i];
//        }
//        else if (n==0){}
//        else if (m>0 && n>0){
//            int len = m+n-1;
//            int left = m-1;
//            int right = n -1;
//            while(left >= 0 && right >= 0){
//                nums1[len--] = nums1[left]>nums2[right]?nums1[left--]:nums2[right--];
//            }
//            while(right >= 0){
//                nums1[len--] = nums2[right--];
//            }
//
//        }
//    }

//0ms,42.2MB
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = m+n-1;
        int left = m-1;
        int right = n -1;
        while(left >= 0 && right >= 0){
            nums1[len--] = nums1[left]>nums2[right]?nums1[left--]:nums2[right--];
        }
        while(right >= 0){
            nums1[len--] = nums2[right--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0};
        int m = 4;
        int[] nums2 = {2,6,7};
        int n = 3;
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, m , nums2, n);
        for(int i : nums1) System.out.println(i);
    }
}
