import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] doubleArrays = new int[]{8,7,5,3,4,9,1,2,10,6};
        Arrays.sort(doubleArrays);
        System.out.printf("%ndoubleArrays: ");
        for (int value : doubleArrays)
            System.out.printf("%d ", value);

        //fill
        int[] FilledArray = new int[10];
        Arrays.fill(FilledArray, 8);
        Output(FilledArray, "filledArray");

        //binarySearch
        int index = Arrays.binarySearch(doubleArrays,14);
        if (index >= 0)
            System.out.printf("%nfound element 14 at index %d in doubleArray%n", index);
        else
            System.out.printf("%nElement 14 not found");

        boolean check = Arrays.equals(doubleArrays,FilledArray);
        System.out.printf("%narray filled %s array double", (check ? "==" : "!="));
    }

    public static void Output(int[] array, String arrayName){
        System.out.printf("%n%s: ", arrayName);
        for (int value : array)
            System.out.printf("%d ",value);
    }

}
