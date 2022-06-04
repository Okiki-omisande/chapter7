public class CommandLIne {
    public static void main(String[] args) {
        if (args.length != 3)
            System.out.println("Error!" + "\ntype in the array length,initial value of array, increment value of array");

        else {
            int arraylength = Integer.parseInt(args[0]);
            int[] array = new int[arraylength];
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < array.length; ++counter)
                array[counter] = (initialValue + increment) * counter;

                System.out.printf("%s   %5s%n","Index", "Value");
               for (int counter  = 0; counter < array.length; ++counter)
                System.out.printf("%5s%8s%n",counter,array[counter]);
        }
    }
}