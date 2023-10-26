package java7andbelow.features.regular_expression;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_RegularExpressionExampleSet2 {

    public static void main(String[] args) {

        ExtractMobileNumber.getMobileNumberFromFile();
        ExtractEmailId.getEmailIdFromFile();
        ExtractTextFileName.getFileName();
    }
}

class ExtractMobileNumber {

    public static void getMobileNumberFromFile(){

        try {
            PrintWriter printWriter = new PrintWriter("extractmobile.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("mobilenumber.txt"));
            Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
            String line = bufferedReader.readLine();
            while (line != null){
                Matcher matcher = pattern.matcher(line);

                if(matcher.find()){
                    printWriter.println(matcher.group());
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class ExtractEmailId {

    public static void getEmailIdFromFile(){

        try {
            PrintWriter printWriter = new PrintWriter("extractmail.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("mail.txt"));
            Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
            String line = bufferedReader.readLine();
            while (line != null){
                Matcher matcher = pattern.matcher(line);

                if(matcher.find()){
                    printWriter.println(matcher.group());
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class ExtractTextFileName {

    public static void getFileName(){

        Pattern pattern = Pattern.compile("[a-zA-Z0-9_.]*[.]txt");
        File folder = new File(System.getProperty("user.dir"));
        String[] files = folder.list();
        assert files != null;
        for (String fileName : files){
            Matcher matcher = pattern.matcher(fileName);
            if(matcher.find() && matcher.group().equals(fileName)){
                System.out.println(fileName);
            }
        }
    }

}