public class Sales {
    public static void main(String[] args) {
        int[][] sales = new  int[3][5];

        for (int row = 0; row < sales.length; ++row) {
            for (int column = 0; column < sales[row].length; ++column) {
                 sales[row][column] = 0;
                System.out.printf("row %d colmn %d = %d%n", row,column,sales[row][column]);
            }
        }
    }
}
