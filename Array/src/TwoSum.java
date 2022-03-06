import java.util.HashMap;

/**
 * @author DouDou
 * @create 05-Mar-2022 5:10 PM
 **/
public class TwoSum {
    //Traversal
//    public int[] twoSum(int[] nums, int target) {
//        int[] ans = {'0','0'};
//        for(int i = 0; i< nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    ans[0]=i;
//                    ans[1]=j;
//                    return ans;
//                }
//            }
//        }
//        return nums;
//    }
//Hashmap<key,value>
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                int left = hm.get(target - nums[i]);
                return new int[]{left, i};
            }
            hm.put(nums[i], i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,13};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] ans = ts.twoSum(nums,target);
        System.out.println(ans[0]+","+ans[1]);

    }
}

