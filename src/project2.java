import java.util.Arrays;

public class project2 {
    public static void main(String[] args) {
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int value : count)
            System.out.printf("%d ", value);
        System.out.println();

        int[] bonus = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int value : bonus) {
            value++;
            System.out.printf("%d ", value);
        }

        System.out.printf("%n%s   %5s%n", "index", "value");
        int[] bestScores = new int[]{10, 20, 30, 40, 50};

        for (int index = 0; index < bestScores.length; ++index) {
            System.out.printf("%5d ", index);
                System.out.printf("%7d ", bestScores[index]);
            System.out.println();
        }
    }
}