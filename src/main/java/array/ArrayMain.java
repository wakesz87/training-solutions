package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", " Péntek", "Szombat", "Vasárnap"};
        System.out.println(weekDays[1] + " a tömb hossza: " + weekDays.length);

        int powerOfTwo[] = new int[5];
        powerOfTwo[0] = 1;
        for (int i = 1; i < powerOfTwo.length; i++) {
            powerOfTwo[i] = powerOfTwo[i - 1] * 2;
        }
        for (int i = 0; i < powerOfTwo.length; i++) {
            System.out.print(powerOfTwo[i] + " " + "\n");
        }

        System.out.println("___________________");

        boolean orTrueOrFalse[] = new boolean[6];
        for (int i = 1; i < orTrueOrFalse.length; i++) {
            orTrueOrFalse[i] = !orTrueOrFalse[i - 1];
        }

        for (int i = 0; i < orTrueOrFalse.length; i++) {
            System.out.print(orTrueOrFalse[i] + " ");
        }



    }
}
