public class FooCorporation {

    public static void main(String[] args) {
        double sum1 = compute(7.50, 35);
        double sum2 = compute(8.20, 47);
        double sum3 = compute(10.0, 73);
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
    }

    public static double compute(double basePay, int hour) {
        if (judge(hour)) {
            apology();
            return 0;
        }

        double result = 0.0;
        if (hour <= 40) {
            result = hour * basePay;
            return result;
        }
        else {
            result = 40 * basePay + (hour - 40) * basePay * 1.5;
            return result;
        }
    }

    public static boolean judge(int hour) {
        if (hour > 60) {
            return true;
        }
        return false;
    }

    public static void apology() {
        System.out.println("error");
    }
}