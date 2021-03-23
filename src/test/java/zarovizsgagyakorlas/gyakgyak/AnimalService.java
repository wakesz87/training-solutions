package zarovizsgagyakorlas.gyakgyak;

public class AnimalService {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = (Bird) animal; // 1
        bird.print();
    }
}
