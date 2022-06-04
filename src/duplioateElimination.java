import java.util.Scanner;

public class duplioateElimination {
    public static void main(String[] args) {
        duplicatedisplay();
    }

    public static boolean checkDuplicate(int[] array, int number) {
        for (int value : array) {
            if (value == number)
                return true;
        }
        return false;
    }

    public static void duplicatedisplay() {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter a number between 10 - 100");

        for (int counter = 0; counter < 5; ++counter) {
            System.out.print("enter input:");
            int user = in.nextInt();

            if (!checkDuplicate(array, user))
                    array[counter] = user;

                    for (int value : array)
                        System.out.printf("%d ", value);
            System.out.println();
            }
        }
    }