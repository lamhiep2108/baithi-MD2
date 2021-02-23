package FileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void readCsvFile(String fileName) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fileName));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                printContact(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printContact(List<String> contact) {
        System.out.println(
                "PhoneBook [id= "
                        + contact.get(0)
                        + ", name= " + contact.get(1)
                        + " , phoneNumber=" + contact.get(2)
                        + " , address=" + contact.get(3)
                        + " , email=" + contact.get(4)
                        + " , facebook=" + contact.get(5)
                        + "]");
    }
}