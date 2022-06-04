public class InitArray {
    public static void main(String[] args) {
        int[][] firstArray = new int[][] {{1,2,3}, {4,5,6}};
        int[][] secondArray = new int[][] {{1,2}, {3}, {4,5,6}};

        System.out.println("The elements in array1");
        outputElement(firstArray);
        System.out.println();

        System.out.println("The elements in array2");
        outputElement(secondArray);
    }

    public static void outputElement(int[][] array){
        for (int row = 0; row < array.length; ++row){
            for (int column = 0; column < array[row].length;++column)
                System.out.printf("%d ", array[row][column]);
            System.out.println();
        }
    }
}
