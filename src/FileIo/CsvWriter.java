package FileIo;

import Entities.PhoneBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Id,Name,PhoneNumber,Address,Email,FacebookLink";

    public static void writeCsvFile(String fileName, ArrayList<PhoneBook> phoneBooks){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (PhoneBook p : phoneBooks) {
                fileWriter.append(String.valueOf(p.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getFacebook());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}