package week02d04;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names  = new String[5];

        for(int i = 0; i< 5; i++){
            System.out.println("Give your name: ");
            names[i] = sc.nextLine();
        }

        int i =1;
        for (String counts : names ){
            System.out.println(i + ".Name: " + counts);
            i++;
        }

    }
}
