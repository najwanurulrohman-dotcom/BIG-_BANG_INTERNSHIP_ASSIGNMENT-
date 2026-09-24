import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("output.json");

            writer.write("[");

            for (int i = 1; i <= 100; i++) {

                String result;

                if (i % 3 == 0 && i % 5 == 0) {
                    result = "BIGBANG";
                }
                else if (i % 3 == 0) {
                    result = "BIG";
                }
                else if (i % 5 == 0) {
                    result = "BANG";
                }
                else {
                    result = String.valueOf(i);
                }

                writer.write("\"" + result + "\"");

                if (i < 100) {
                    writer.write(", ");
                }
            }

            writer.write("]");

            writer.close();

            System.out.println("output.json created successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
