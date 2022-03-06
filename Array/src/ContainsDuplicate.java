import java.util.HashSet;
import java.util.Set;

/**
 * @author DouDou
 * @create 03-Mar-2022 7:39 PM
 **/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {'1','2','1'};
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean ans = cd.containsDuplicate(nums);
        System.out.print(ans);
    }
}
