public class Salary {
    public static void main(String[] args) {
        int[] salary = new int[]{239, 416, 308, 604, 321, 435, 679, 349, 656,1028};
        int[] frequency = new int[11];

        for (int EmployeeSalary : salary)
            ++frequency[EmployeeSalary / 100];

        System.out.printf("%s     %9s%n", "Range", "Frequency");

        for (int counter = 0; counter < frequency.length; ++counter) {
            if (counter == 10)
                System.out.printf("%8d:", 1000);
            else
            System.out.printf("$%03d-%03d: ", counter * 100, (counter * 100) + 99);

            for (int star = 0; star < frequency[counter]; ++star)
                System.out.print("*");
                System.out.println();
        }
    }
}
