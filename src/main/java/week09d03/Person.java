//A mai feladatban Mikulásnak segítünk ajándékokat kiosztani. A week09d03 csomagba dolgozz.
// Készíts egy Present nevű enumot a következő felsorolókkal: Toy, Electronic, Housekepping, Decoration.
// Ezek fogják az ajándékok típusát reprezentálni. Készíts egy Person osztályt legyen neki neve és életkora és legyen
// egy Present típusú attribútuma. A nevet és életkort konstruktorban kapja meg. Legyen egy setPresent() metódusa ami
// beállítja az ajándék attribútumot véletlenszerűen, egy kitétel van, 14 év fölötti nem kaphat játékot.
// Ennek megvalósításához szabadon bővíthetőek az eddig elkészült elemek.
// Legyen egy SantaClaus osztály, akinek van egy Person listája, amit konstruktorban kap meg.
// Legyen neki egy getThroughChimneys() metódusa, ami végigmegy az emberek listáján és meghívja minden ember setPresent() metódusát.
package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        if(age < 0) {
            throw new IllegalArgumentException("The age not valid"); }

        this.name = name;
        this.age = age;
        this.present = setPresent();
    }

    public Present setPresent() {
        Random random = new Random(1);
        int indexOfPresent = 0;
        if (this.age <= 14) {
            indexOfPresent = random.nextInt(4);
        }else if (this.age >14){
            indexOfPresent = random.nextInt(3)+1;
        }
        Present presentOfThisperson = Present.values()[indexOfPresent];
        return presentOfThisperson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
}
