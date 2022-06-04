public class ArrayEven {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int counter = 0; counter < array.length; ++counter) {
            array[counter]= (counter * 2) + 2;
        }
        System.out.printf("%s    %8s%n", "index", "initial value");

        for (int counter = 0; counter < array.length; ++counter){
            System.out.printf("%5d    %8d%n",counter,array[counter]);
        }
    }
}