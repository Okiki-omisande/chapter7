public class Array {
    public static void main(String[] args) {
        int[] c;
        c = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("%s       %8s%n", "index", "initial value");
        for (int counter=0; counter < c.length; ++counter){
            System.out.printf("%5s%8s%n",counter, c[counter]);
        }

    }
}
