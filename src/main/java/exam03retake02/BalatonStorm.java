package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {
    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> stationsInStorm = new ArrayList<>();
        String station = "";
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("allomas")) {
                String[] trash = line.split(": ");
                String name = trash[1];
                station = name.substring(1, name.length() - 2);
            }
            if (line.contains("level\": 3")) {
                stationsInStorm.add(station);
            }

        }
        //lista rendezése
        stationsInStorm.sort(Collator.getInstance(new Locale("hu", "HU")));
        return stationsInStorm;
    }

}

/*
*Írj egy programot, mely kilistázza, hogy hol van vihar! Ábécésorrendbe rendezve!
* Azokon az állomásokon van vihar, ahol a level értéke 3.
*/
