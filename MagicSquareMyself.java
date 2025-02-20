import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class MagicSquareMyself {
    public static void main(String[] args)  throws IOException {
        String[] filenames = {"./Luna.txt", "./Mercury.txt"};
        for (String filename : filenames) {
            System.out.println(filename + "is MAGIC ?" + testMagic(filename));
                    }
                }
            
    public static boolean testMagic(String filename) throws IOException {
        FileReader file1 = new FileReader(filename);
        BufferedReader br1 = new BufferedReader(file1);
        String line;
        int rowSum = 0;
        int temp = 0;
        while ((line = br1.readLine()) != null) {
            if (line.trim().isEmpty()) { // Ìø¹ý¿ÕÐÐ
                continue;
            }

            String[] numberString = line.split("\t");
            // System.out.println(Arrays.toString(numberString));
            temp = 0;
            for (String numberString1 : numberString) {

                temp += Integer.parseInt(numberString1);
            }
            if (rowSum == 0) {
                rowSum = temp;
            } else {
                if (rowSum != temp) {
                    System.out.println("Woops! NOT Magic Square");
                    br1.close();
                    return false;
                }
            }

        }
        br1.close();
        System.out.println("THIS IS MAGIC SQUARE!");
        return true;
    }
}
