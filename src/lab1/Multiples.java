package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiplesOfThree(1000));
    }

    private static int multiplesOfThree(int i) {
        int n = 1;
        int count = 0;
        while (n < i) {
            if (n % 3 == 0 || n % 5 == 0) {
                count++;
            }
            n++;
        }
        return count;
    }
}
