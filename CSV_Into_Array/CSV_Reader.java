package JavaPractice.CSV_Into_Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV_Reader {
    public static void main(String[] args) throws IOException {

        String pathToCSVFile = "CSV_Into_Array/bg.csv";

        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToCSVFile));

        while ((line = bufferedReader.readLine()) != null) {
            String[] values = line.split(",");
            System.out.println("Cities: " + values[0]+"," + " Population: " + values[7]);
        }
    }
}
