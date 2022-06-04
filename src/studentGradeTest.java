public class studentGradeTest {
    public static void main(String[] args) {
        int[] GradeScore = new int[]{87,68,94,100,83,78,85,91,76,87};

        studentGrade gradebook = new studentGrade(GradeScore,"Java programming 101");
        System.out.printf("Welcome to student grade book 2021/2022 session for %s%n%n",gradebook.getCourseName());
        gradebook.processGrade();
    }
}
