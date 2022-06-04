public class gradeBook {
    private static int[][] grade;
    private static String CourseName;

    public gradeBook(int[][] grade, String CourseName) {
        gradeBook.grade = grade;
        gradeBook.CourseName = CourseName;
    }
    
    public static String getCourseName() {
        return CourseName;
    }

    public static int GetMinimum() {
        int lowest = grade[0][0];
        for (int[] row : grade) {
            for (int column : row) {
                if (column < lowest)
                    lowest = column;
            }
        }
        return lowest;
    }

    public static int GetHighest() {
        int highest = grade[0][0];
        for (int[] row : grade) {
            for (int column : row) {
                if (column > highest)
                    highest = column;
            }
        }
        return highest;
    }

    public static double GetAverage(int[] array) {
        int Total = 0;
        for (int number : array)
            Total += number;

        return (double) Total / array.length;
    }

    public static void GetBarchart() {
        int[] frequency = new int[11];
        for (int[] row : grade) {
            for (int column : row)
                ++frequency[column / 10];
        }

        System.out.println("The students grade chart are as follow:");

        for (int counter = 0; counter < frequency.length; ++counter) {
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", counter * 10, (counter * 10) + 9);

            for (int star = 0; star < frequency[counter]; ++star)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void Outputgrade() {
        System.out.printf("The grades are:%n%n");
        System.out.print("          ");

        for (int test = 0; test < grade[0].length; ++test)
            System.out.printf(" Test%d ", test + 1);

        System.out.println(" Average");

        for (int student = 0; student < grade.length; ++student) {
            System.out.printf("Student%d", student + 1);
            for (int test : grade[student])
                System.out.printf("%6d ", test);
            System.out.printf("%9.2f%n",GetAverage(grade[student]));
        }
    }

    public static void ProcessGrade(){
        Outputgrade();
        System.out.printf("%nThe lowest grade is:%d%n" +"The highest grade is:%d%n%n",GetMinimum(),GetHighest());
        GetBarchart();
    }
}
