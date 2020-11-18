package week04;

public class StringMethods {
    public static void main(String[] args) {
        String name = "John Doe";
        String uppercased =  name.toUpperCase();
        System.out.println(uppercased);

        System.out.println("alma".toUpperCase().substring(0, 2));
        String anotherName = null;
      //  System.out.println(anotherName.equals("John"));
        System.out.println("John".equals(anotherName));

        System.out.println(  String.join("_","a", "b","c", "d"));
    }
}
