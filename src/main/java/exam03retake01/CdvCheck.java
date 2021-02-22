package exam03retake01;

public class CdvCheck {
    public boolean check(String number) {
        if (number.length() != 10) {
            throw new IllegalArgumentException("The number not ten character long!");
        }
        int sum = 0;
        int lastChar;
        try {
            lastChar = Integer.parseInt(number.substring(9));
            for (int i = 0; i < 9; i++) {
                sum += (i+1) * Integer.parseInt(number.substring(i, i + 1));
            }
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not valid input");
        }
        return (sum % 11) == lastChar;
    }
}



