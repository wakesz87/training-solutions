package classstructuremethods;
import java.util.Scanner;
public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();
        note.setName(name);
        System.out.println("Topic:");
        String topic = scanner.nextLine();
        note.setTopic(topic);
        System.out.println("Note text:");
        String text = scanner.nextLine();
        note.setText(text);
        System.out.println(note.getNoteText());
    }
}
