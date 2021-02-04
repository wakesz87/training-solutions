package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {
    public int sumNumbers() {


        int sumNumber=0;


        String fileName;
        for (int actualFile = 0; actualFile < 100; actualFile++) {

            fileName = String.format("number%02d.txt",actualFile);
            Path file = Path.of(fileName);
            try {
                if (Files.isRegularFile(file)) {
                    sumNumber += Integer.parseInt(Files.readString(file));

                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }

        return sumNumber;
    }

    public static void main(String[] args) {
        FileSum fileSum = new FileSum();
        System.out.println(fileSum.sumNumbers());
    }

}
