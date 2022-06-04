public class AverageEllipsis {
    public static double average(double...numbers){
        double total = 0;
        for (double check : numbers)
            total += check;
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double d1= 10.0;
        double d2= 20.0;
        double d3= 30.0;
        double d4= 40.0;

        System.out.printf("d1 = %.1f%n" + "d2 = %.1f%n" + "d3 = %.1f%n" + "d4 = %.1f%n", d1,d2,d3,d4);
        System.out.printf("Average of d1 and d2 = %.1f%n" + "Average of d1,d2,d3 and d4 = %.1f",average(d1,d2),average(d1,d2,d3,d4));
    }
}
