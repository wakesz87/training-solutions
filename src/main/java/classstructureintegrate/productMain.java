
package classstructureintegrate;

import java.util.Scanner;

 class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product name:");
        String name = scanner.nextLine();

        System.out.println("Product price:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increasePrice(30);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decreasePrice(15);
        System.out.println(product.getName() + " " + product.getPrice());
    }
}
