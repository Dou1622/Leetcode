/**
 * @author DouDou
 * @create 15-Mar-2022 2:17 PM
 **/
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0; i<matrix.length;i++){
            if (target <= matrix[i][matrix[i].length-1] && target>= matrix[i][0]) {
                for(int j =0; j< matrix[i].length;j++){
                    if(target == matrix[i][j])
                        return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        SearchA2DMatrix sam = new SearchA2DMatrix();
        System.out.println(sam.searchMatrix(matrix,target));
    }
}
