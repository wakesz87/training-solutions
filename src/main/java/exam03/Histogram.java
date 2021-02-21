package exam03;



import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while((line=reader.readLine()) != null) {
            for(int i = 0; i < Integer.parseInt(line); i++) {
                sb.append("*".replaceAll("[\"12345678\"]","*"));
            }
        }
        return sb.toString();
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

/*
package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {
    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                int data = Integer.parseInt(line);
                sb.append("*".repeat(Math.max(0, data))).append('\n');
            }
        } catch (IOException e) {
            throw new IllegalStateException("Something happened!");
        }
        return sb.toString();
    }
}  */
