public class NewLine {
    public static void newLine() {
        System.out.println();
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] argus) {
        System.out.println("1");
        threeLines();
        System.out.println("5");
    }
}
