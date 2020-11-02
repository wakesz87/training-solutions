package classstructureattributes;
import java.util.Scanner;
public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who is the artist of your favorite song? :");
        song.band = scanner.nextLine();
        System.out.println("What is the title of your favorite song? :");
        song.title = scanner.nextLine();
        System.out.println("How long is the song?");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length + "min)");
    }
}
