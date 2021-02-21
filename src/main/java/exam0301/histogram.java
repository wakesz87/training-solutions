package exam0301;

import exam03.Histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class histogram {
    public String createHistogram(BufferedReader bufferedReader) throws IOException{
        String result = "";
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            int stars=Integer.parseInt(line);
            for (int i = 0; i <stars ; i++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;


    }


    public static void main(String[] args) {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/histogram.txt"))) {
            Histogram histogram = new Histogram();
            System.out.println(histogram.createHistogram(reader));
        } catch(IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

}