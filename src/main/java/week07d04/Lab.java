package week07d04;

import java.time.LocalDate;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(LocalDate completedAt) {
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete() {
        this.completedAt = LocalDate.now();
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Subject info: " +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt;
    }

}
/* Hozz létre egy Lab nevű osztályt, ami azt tárolja el, hogy melyik feladattal készültél el.
Két attribútuma: title ami a tananyag neve, egy completed, hogy elkészültél-e vele,
 és a completedAt , ami azt tárolja, hogy mikor. Legyen két konstruktora!
 Az egyik csak a címet várja, ekkor úgy állítsa be a példányt, hogy még nem készültél el.
 Legyen egy másik, ami várja a címet és a dátumot. Ekkor azt állítsa be, hogy elvégezted a gyakorlati feladatot.
  Írj egy complete metódust, ami kap egy dátumot, és beállítja, hogy elvégezted a gyakorlati feladatot.
  Legyen egy complete metódusa, ami semmit nem vár, ez azt állítja be, hogy MOST végezted el a gyakorlati feladatot.
  Írd meg a toString metódusát is! (edited) */