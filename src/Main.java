import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:/Users/pc/Desktop/Nouveau dossier/document.txt";


        int total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = br.readLine()) != null) {

                Matcher matcher = Pattern.compile("\\d").matcher(line);

                String first = null;
                String last = null;

                while (matcher.find()) {
                    String number = matcher.group();


                    if (first == null) {
                        first = number;
                    }

                    last = number;
                }


                if (first != null && last != null) {
                    int concatenatedNumber = Integer.parseInt(first + last);
                    total += concatenatedNumber;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("total :  " + total);
    }
}
