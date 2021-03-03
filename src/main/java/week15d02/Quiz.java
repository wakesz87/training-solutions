//A fájlban az egy kérdéshez tartozó adatok két sorban helyezkednek el.
// Első sorban a kérdés, a második sorban a válasz a pontszám és a téma, szóközzel elválasztava.
// Olvasd be a fájl tartalmát a memóriába, majd oldjátok meg a lenti feladatokat.
//Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában. (Csak a kérdéseket)
//Írj egy metódust, ami random sorsol ki egy kérdést, és adja vissza annak összes adatát.
//Készíts egy metódust ami rendszerezi a kérdéseket témakörönként.
// Visszatér egy adatszerkezetben amelyben témánként megtalálható az összes kérdés, összes adata.
//Az előző feladat segítségével határozd meg, hogy melyik téma kérdései érik a legtöbb pontot (összpontszám)!
package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private List<Question> questions = new ArrayList<>();

    public void readFile(String fileName) {
        Path path = Path.of("src/main/resources/" + fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String secondLine = br.readLine();
                String[] parts = secondLine.split(" ");
                String answer = parts[0];
                int point = Integer.parseInt(parts[1]);
                String category = parts[2];
                questions.add(new Question(line, answer, point, category));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    public List<String> questionsByCategory(String category) {
        List<String> result = new ArrayList<>();
        for (Question q : questions) {
            if (q.getCategory().equals(category)) {
                result.add(q.getQuestion());
            }
        }
        return result;
    }

    public Question randomQuestion(Random rnd) {
        int index = rnd.nextInt(questions.size());
        return questions.get(index);
    }

    public Map<String, List<Question>> allQuestionsByCategory() {
        Map<String, List<Question>> result = new HashMap<>();
        for (Question q : questions) {
            if (!result.containsKey(q.getCategory())) {
                result.put(q.getCategory(), new ArrayList<>());
            }
            result.get(q.getCategory()).add(q);
        }
        return result;
    }

    public String categoryWithMostPoints() {
        Map<String, List<Question>> toProcess = allQuestionsByCategory();
        String name = null;
        int counter = 0;
        for (String s : toProcess.keySet()) {
            int count2 = countPoints(toProcess,s);
            if (count2 > counter) {
                counter = count2;
                name = s;
            }
        }
        return name;
    }

    private int countPoints(Map<String, List<Question>> toProcess,String key) {
        int count2 = 0;
        for (Question q : toProcess.get(key)) {
            count2 += q.getPoint();
        }
        return count2;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}