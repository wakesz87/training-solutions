package week16d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    void filterVowelsTest() throws IOException {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/vowels.txt"))) {
            Vowels vowels = new Vowels();
            StringBuilder sb = new StringBuilder(vowels.vowelRemove(reader));
            assertEquals("prcsk\n" +
                    "Klpcsk\n" +
                    "Bnn\n" +
                    "Cscsk\n" +
                    "Mcsk\n" +
                    "Mcsk\n", sb.toString());
        }
    }

}