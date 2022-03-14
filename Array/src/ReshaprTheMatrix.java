/**
 * @author DouDou
 * @create 14-Mar-2022 1:59 PM
 **/
public class ReshaprTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[r][c];
        if(r*c == m*n){
            for(int i =0; i<m*n;i++) {
                ans[i/c][i%c] =mat[i/n][i%n];
            }
        }else{
            return mat;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat ={{1,2},{3,4}};
        int r = 1;
        int c = 4;
        ReshaprTheMatrix rh = new ReshaprTheMatrix();
        int[][] ans = rh.matrixReshape(mat, r ,c);
        for(int i =0; i< ans.length;i++){
            for(int j =0; j< ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
