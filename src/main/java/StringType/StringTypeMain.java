package StringType;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix ="Hello ";
        String  name = "John Doe";
        String message = prefix + name;
        System.out.println(message);
        message = message +  444;
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);
        String x = "";
        String y = "";
        String z = x + y;
        System.out.println(z.length());
        String alphabet = "abcde";
        System.out.println(alphabet.length());
        System.out.println(alphabet.substring(0,2));
        System.out.println(alphabet.charAt(0) + ";" + alphabet.charAt(2));



    }
}
