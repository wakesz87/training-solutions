//Töltsd le a példa bináris állomány a
// https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat címről!
// Ez bájtokat tartalmaz, egy szöveg van titkosítva benne. Olvasd be bájtonként, és mindegyik bájthoz adjál hozzá tízet!
// Ez valójában egy karakterkód, ezt alakítsd át char típusú értékké! Majd egymás után írd ki ezeket a konzolra!
// Ne használj közöttük sortörést!

package week12d04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class SecretMessage {

    public void readSecretMessage(String file) {
        Path path = Path.of(file);
        try (InputStream is = new BufferedInputStream(Files.newInputStream(path))) {
            byte[] bytes = new byte[10];
            int size;
            while ((size = is.read(bytes)) > 0) {
                for (int i = 0; i < size; i++) {
                    int x = (int)bytes[i] + 10;
                    char ch = (char) x;
                    System.out.print(ch);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public static void main(String[] args) {
        SecretMessage sm = new SecretMessage();
        sm.readSecretMessage("src/main/resources/secret.dat");
    }
}