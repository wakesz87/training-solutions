package week02d03;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p){
      return name.equals(p.name);
    }

    public static void main(String[] args) {
        Product p = new Product("szalámi", "1000");
        Product p1 = new Product("sajt", "1000");
        Product p2 = new Product("szalámi", "1000");
        Product p4 = new Product("sonka", "1000");

        System.out.println(p.areTheyEqual(p1));
        System.out.println(p.areTheyEqual(p2));
        System.out.println(p.areTheyEqual(p4));

    }


}
