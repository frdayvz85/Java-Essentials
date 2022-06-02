public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        if (rowNum*colNum != linearData.length) {
            throw new IllegalArgumentException("")
        }
        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int[rowNum][colNum];

        for (int i = 0; i < linearData.length; i++) {
            int row = (int) Math.floor(i/colNum);
            int col = i % colNum;
            data[row][col] = linearData[i];
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDelim = "";
        String colDelin = "";
        for (int[] row : data) {
            sb.append(rowDelim);
            rowDelim = ";";
            for (int element : row) {
                sb.append(colDelin);
                colDelin = ",";
                sb.append(element);
            }
            colDelin = "";
        }
        return sb.toString();
    }
}