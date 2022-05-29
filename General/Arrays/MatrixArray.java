package Arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] arrs = { { 10, 20, 30 }, { 40, 50, 60 } }; // 2x3
        // System.out.println(arrs[0][0]);
        // System.out.println(arrs[1][2]);

        int[][] arrs2 = new int[2][2];
        arrs2[0][0] = 10;
        arrs2[0][1] = 20;
        arrs2[1][0] = 30;
        arrs2[1][1] = 40;
        // System.out.println(arrs2[1][0]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arrs2[i][j]);
            }
        }
    }
}
