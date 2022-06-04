public class StudentPoll {
    public static void main(String[] args) {
        int[] StudentResponse = new int[]{1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] counter = new int[6];

        for (int index = 0; index < StudentResponse.length; ++index){
            try {
                ++counter[StudentResponse[index]];
            }
            catch (ArrayIndexOutOfBoundsException O){
                System.out.println(O);
                System.out.printf("StudentResponse[%d] = %d%n",index,StudentResponse[index]);
            }
        }

        System.out.printf("%s %9s%n","Rating","Frequency");
        for (int Rating = 1; Rating < counter.length; ++Rating)
            System.out.printf("%6s%10s%n",Rating,counter[Rating]);
    }
}
