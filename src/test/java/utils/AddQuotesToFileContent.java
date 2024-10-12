package utils;

import java.io.*;

public class AddQuotesToFileContent {

    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String outputFile = args[1];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String modifiedLine = "'" + line + "',";
                bufferedWriter.write(modifiedLine);
                bufferedWriter.newLine();
            }
            System.out.println("Data from " + inputFile + " is successfully modified and written to " + outputFile);
        } catch (IOException e) {
            throw new RuntimeException("Error reading or writing files:" + e);
        }
    }

}
