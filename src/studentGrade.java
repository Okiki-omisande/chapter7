public class studentGrade {
    private static int[] grade;
    private static String courseName;

    public studentGrade(int[] grade, String courseName) {
        studentGrade.grade = grade;
        studentGrade.courseName = courseName;
    }


    public String getCourseName() {
        return courseName;
    }

    public static int getMinimum() {
        int lowestGrade = grade[0];
        for (int number : grade) {
            if (number < lowestGrade)
                lowestGrade = number;
        }
        return lowestGrade;
    }

    public static int getMaximum() {
        int highestGrade = grade[0];
        for (int number : grade) {
            if (number > highestGrade)
                highestGrade = number;
        }
        return highestGrade;
    }

    public static int getGradeAverage() {
        int Total = 0;
        for (int number : grade)
            Total += number;
        return Total / grade.length;
    }

    public static void outputGrade() {
        System.out.println("the grades are:");
        for (int Student = 0; Student < grade.length; ++Student)
            System.out.printf("Student %2d: %3d%n%n", Student + 1, grade[Student]);
    }

    public static void getGradeBarChart(){
        int[] frequency = new int[11];
        for (int number : grade)
            ++frequency[(number / 10)];
        System.out.println("\nThe student grades chart are as follow:");
        for (int counter = 0; counter < frequency.length; ++counter) {
            if (counter == 10)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%02d-%02d:", counter * 10, (counter * 10) + 9);

            for (int star = 0; star < frequency[counter]; ++star)
                System.out.print("*");
            System.out.println();
        }

    }

    public void processGrade(){
        outputGrade();
        System.out.printf("The average of the student grades is = %d%n", getGradeAverage());
        System.out.println("The lowest grade is  = " +getMinimum() +"\nThe highest of the grade is = " +getMaximum());
        getGradeBarChart();
    }

}