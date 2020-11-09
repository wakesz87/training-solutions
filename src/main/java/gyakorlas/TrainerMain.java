package gyakorlas;

import java.util.Scanner;

public class TrainerMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trainer trainer = new Trainer();
        trainer.name = "Kiss Janos " ;
        trainer.yearOfBirth = 1992;
        trainer.oszaly =  "Elso osztaly";
        System.out.println(trainer.name + trainer.yearOfBirth);
        System.out.println(trainer.oszaly);

        Trainer anothertariner = new Trainer();
        anothertariner.name = "Kovács Béla ";
        anothertariner.yearOfBirth = 1955;
        anothertariner.oszaly = "Masodik osztaly";
        System.out.println(anothertariner.name + anothertariner.yearOfBirth);
        System.out.println(anothertariner.oszaly);


        Trainer othertrainer = new Trainer();
        othertrainer.name = "Kavics Elek ";
        othertrainer.yearOfBirth = 2001;
        othertrainer.oszaly = "Harmadik osztaly";
        System.out.println(othertrainer.name + othertrainer.yearOfBirth);
        System.out.println(othertrainer.oszaly);

        System.out.println("A képzők nevei: " + trainer.name + " , " + anothertariner.name + " , "+ othertrainer.name );
    }

}
