import java.security.SecureRandom;
public class DiceCounter {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] dice = new int[7];
        System.out.printf("%s%10s%n", "face", "frequency");

        for (int counter = 1; counter <= 6000000; ++counter) {
            ++dice[1 + random.nextInt(6)];
        }
            for (int face = 1; face < dice.length; ++face)
                System.out.printf("%4d%10d%n", face, dice[face]);

    }
}
