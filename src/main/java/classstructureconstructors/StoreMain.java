package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store drinkStore = new Store("whisky");
        drinkStore.store(30);
        System.out.println(drinkStore.getProduct() + ": " + drinkStore.getStock());

        Store cigarStore = new Store("cigar");
        cigarStore.store(30);
        System.out.println(cigarStore.getProduct() + ": " + cigarStore.getStock());

        drinkStore.dispatch(7);
        cigarStore.dispatch(13);
        drinkStore.store(2);
        cigarStore.store(9);

        System.out.println(drinkStore.getProduct() + ": " + drinkStore.getStock());
        System.out.println(cigarStore.getProduct() + ": " + cigarStore.getStock());
    }
}