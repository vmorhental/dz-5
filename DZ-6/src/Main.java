public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 3;
        int d = 2;
        int sum1 = a + b;
        int sum2 = c + d;
        String comparison1 = sum1 > sum2 ? "true":"not bigger";
        System.out.println(comparison1);

        sum1 += 1;
        sum2 -= 2;

        String comparison2 = sum1 > sum2 ? "true":"not bigger";
        System.out.println(comparison2);

        System.out.println (sum1%2 == 0 || sum2%2 == 0);
    }
}
