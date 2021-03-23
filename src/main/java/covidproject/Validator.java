package covidproject;

public class Validator {

    public static String nameValidator(String name) {
        //validateIsNotNullOrEmptyString(name);
        String[] split = name.split(" ");
        if (split.length < 2) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        for (int i = 0; i < split.length; i++) {
            boolean isNameStartsWithLowerCase = Character.isLowerCase(split[i].charAt(0));
            if (isNameStartsWithLowerCase) {
                throw new IllegalArgumentException("Invalid name format: " + name + " Full name format required.");
            }
        }
        return name.trim();
    }

    public static String emailValidator(String email) {
       // validateIsNotNullOrEmptyString(email);
        // Ha nincs kukac az emailben,vagy a kukac előtt kevesebb,mint 3 karakter található vagy utána nincs pont
        // karakter,akkor hibát dob
        if (email.contains("@")) {
            String[] split = email.split("@");
            if (split[0].length() > 2 && split[1].contains(".")) {
                return email.toLowerCase();
            }
        }
        throw new IllegalArgumentException("Invalid email address: " + email);
    }
}
