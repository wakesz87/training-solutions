package week02.Train;

public class StringTypeMain {
    public static void main(String[] args) {
        String s1 ="";
        String s2 = "Hello World";
        String s3 = "Hello  " + "World";
        System.out.println(s3);
        System.out.println(s2.equals(s3));
        System.out.println(s3.indexOf("World"));
        System.out.println(s3.indexOf("xxx"));
        System.out.println(s3.length());
        System.out.println(s3.substring(0, 2));
        System.out.println(s3);




    }
}

