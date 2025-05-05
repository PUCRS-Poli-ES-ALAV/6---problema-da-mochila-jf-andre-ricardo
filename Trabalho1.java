public class Trabalho1 {

    public int tamanho(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] mat = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
            }
        }

        mat[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    mat[i][j] = mat[i-1][j-1] + 1;
                }
                else{
                    mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
                }

            }

        }
        return mat[m][n];
    }
}


// BANANA
//A011111
//A011222
//N012233



//  S  A  B  A  D  O
//S 1  1  1  1  1  1
//E 1  1  1  1  1  1
//G 1  1  1  1  1  1
//U 1  1  1  1  1  1
//N 1  1  1  1  1  1
//D 1  1  1  1  2  2
//A 1  2  2  2  2  2