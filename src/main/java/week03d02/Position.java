//* Írj egy Position osztályt, melynek van egy name és egy bonus attribútuma!
// Egy alkalmazotti pozíciót jelöl, melynek a bonus attribútuma tárolja,
// hogy ebben a pozícióban évente mennyi bónuszt kap egy alkalmazott.
// A main metódusban hozz létre egy Position objektumokat tartalmazo listát!
//Menj végig a lista elemein, és írd ki azokat, ahol a bónusz magasabb, mint 150_000. Azonban a kiírás
//formátumát a Position osztály toString() metódusában implementáld!


package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString() {
        return name + " ; " + bonus + " Ft";
    }

    public static void main(String[] args) {
        List<Position> positionList = new ArrayList<>();
        Position p1 = new Position("Laci", 100000);
        Position p2 = new Position("Peti", 200000);
        Position p3 = new Position("Szabi", 160000);
        Position p4 = new Position("Julcsa", 120000);

        positionList.add(p1);
        positionList.add(p2);
        positionList.add(p3);
        positionList.add(p4);

        for(Position p : positionList){
            if(p.getBonus() > 150000){
                System.out.println(p.toString());
            }
        }

    }
}
