// java program for matrix multiplication 
public class matrix_multiplication {
    public static void main(String s[]) {
        int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int mat2[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        int mat3[][] = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.println(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }

}
