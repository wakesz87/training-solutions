//A fájl tantárgyfelosztást tartalmaz. A tanttárgyfelosztást 4-es blokkokban adjuk meg.
// Első sor a tanár neve, majd a tantárgy, majd az osztály ahol tanítja és végül az, hogy heti hány órában.
// Írj egy metódust,ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten.
// A fájl megtalálható a examples\week13d03\src\main\resources\beosztas.txt
package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Teacher {
    public int getNumber(Reader reader, String teacherName) {
        try (BufferedReader br = new BufferedReader(reader)) {
            return count(br, teacherName);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private int count(BufferedReader br, String teacherName) throws IOException {
        int sum = 0;
        String line;
        while ((line = br.readLine()) != null) {
            skipTwoLines(br);
            int number = Integer.parseInt(br.readLine());
            if (line.equals(teacherName)) {
                sum += number;
            }
        }
        return sum;
    }

    private void skipTwoLines(BufferedReader br) throws IOException {
        br.readLine();
        br.readLine();
    }
}
