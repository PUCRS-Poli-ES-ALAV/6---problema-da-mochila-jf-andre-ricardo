public class Distancia {
    private int iteration;

    public int ed1(String s, String t, int i, int j){
        iteration = 0;
        int res = ed(s,t,i,j);
        System.out.println("iterations = " + iteration);
        return res;
    }

    public int ed(String s, String t, int i, int j){
        if(i == 0 && j == 0) return 0;
        iteration++;
        if(j == 0) return ed(s,t,i-1,j) + 1;
        if(i == 0) return ed(s,t,i,j-1) + 1;



        if(s.charAt(s.length() - i) == t.charAt(t.length() - j)){
            return ed(s,t,i-1,j-1);
        }


        return ed(s,t,i-1,j-1) + 1;
    }



    int custoExtra = 0;

    public int ed2(String A, String B){
        int m = A.length();
        int n = B.length();
        int[][] mat = new int[m+1][n+1];
        mat[0][0]=0;
        for(int i = 1; i <= m; i++){
            mat[i][0] = mat[i-1][0] + 1;
        }
        for(int i = 1; i <= n; i++){
            mat[0][i] = mat[0][i-1] + 1;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){

                if (B.length() < i-1){
                    if (A.charAt(i-1) == B.charAt(i-1)){
                        custoExtra = 0;
                        mat[i][j] = mat[i - 1][j - 1];
                    }
                }
                else{
                    custoExtra = 1;
                    mat[i][j] = Math.min(Math.min(mat[i-1][j] +1, mat[i][j-1] +1), mat[i-1][j-1] + custoExtra);
                }

            }
        }
        return mat[m][n];
    }

//    // Assumindo os Custos: Remoção=R, Inserção=I , Substituição=S e Match=M=0;
//
//    inteiro distEdProgDina(string A, String B)
//    m = tamanho(A);
//    n = tamanho(B);
//    matriz[0][0] = 0;
//    Para i = 1 até m
//      matriz[i][0] = matriz[i-1][0] + 1  // soma uma I;
//    Para j = 1 até n
//      matriz[0][j] = matriz[0][j-1] + 1  // Soma uma R;
//    Para i = 1 até m
//      Para j = 1 até n
//          Se A[i] == B[j]
//          custoExtra = 0 //Operação M;
//      Senão
//            custoExtra = 1 //Operação S;
//          matriz[i][j] = Mínimo(matriz[i-1][j] +1, matriz[i][j-1] +1,
//          matriz[i-1][j-1] + custoExtra];
//      devolva matriz[m][n];
}
