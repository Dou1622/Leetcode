import java.util.ArrayList;
import java.util.List;

/**
 * @author DouDou
 * @create 14-Mar-2022 3:43 PM
 **/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans  = new ArrayList<>();
        for(int i=0; i< numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j =0; j<= i; j++){
                if(j==0 || j==i){
                    innerList.add(1);
                }else{
                    innerList.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(innerList);
        }
        return ans;
    }

    public static void main(String[] args) {
        int numRows =6;
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(pt.generate(numRows));
    }
}
