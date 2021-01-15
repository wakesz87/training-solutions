package exceptions;

import java.util.Scanner;

public class NumbersReader {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(NumbersReader.class.getResourceAsStream("numbers.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int number = Integer.parseInt((line));
                System.out.println(number);
            }
        }
        catch (NumberFormatException nfe) {
          // System.out.println("Invalid number");
            throw new IllegalStateException("Invalid number", nfe);
        }

        catch (NullPointerException e) {
          //  System.out.println("file not found");
            throw e;
        }


        finally {
            if (sc != null) {
                sc.close();

            }

        }
    }
}

