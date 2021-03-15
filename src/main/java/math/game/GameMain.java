package math.game;

public class GameMain {

    public static void main(String[] args) {
        Point point1 = new Point(10,20);
        Point point2 = new Point(13,14);

        Warrior w1 = new Warrior("Gandalf", point1);
        Warrior w2 = new Warrior("Frodo", point2);

        System.out.println(w1.toString());
        System.out.println(w2.toString());


        int round = 1;

        while (w2.distance(w1) != 0) {
            w1.move(w2);
            w2.move(w1);
            System.out.println(round + ". round");
            System.out.println(w1.toString());
            System.out.println(w2.toString());
            round++;
        }

        while(w1.isAlive() && w2.isAlive()){
            w1.attack(w2);
            w2.attack(w1);
            System.out.println(round + ". round");
            System.out.println(w1.toString());
            System.out.println(w2.toString());
            round++;
        }




    }

    }

