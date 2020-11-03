package statements;

public class StatementsMain {
    public static void main(String[] args) {
        int x = 5+6;
        System.out.println(x);
        int y = 11-x;
        System.out.println(y);
        int z = 8;
        boolean b = x > y;
        System.out.println(b);
        boolean c = b || (z > 5);
        System.out.println(c);
        z++;
        System.out.println(z);


    }
}
