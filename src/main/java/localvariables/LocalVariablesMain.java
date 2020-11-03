package localvariables;
                                            // nem tudom kiíratni
public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;               //boolean b = false;
        b = false;
        System.out.println(b);
        int a = 2, i = 3, j = 4;
        int k = i;
        String s;
        s = "World is mine ";
        String t = s;
        {
            int x = 0;              //nem lehet
        }
        System.out.println(s);


    }
}
