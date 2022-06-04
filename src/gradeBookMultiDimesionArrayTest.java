public class gradeBookMultiDimesionArrayTest {
    public static void main(String[] args) {

        int[][] gradebook = new int[][]{{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85},
                {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        gradeBook reportcard =  new gradeBook(gradebook, "java programming 101");

        System.out.printf("Welcome to the grade book for %s%n", reportcard.getCourseName());
        reportcard.ProcessGrade();

    }
}
