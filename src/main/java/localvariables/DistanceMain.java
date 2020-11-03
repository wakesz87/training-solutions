package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(99.9, false);
        System.out.println(distance.getDistanceInKm() + "+" +distance.isExact());
        int full = (int) distance.getDistanceInKm();
        System.out.println(full);
    }
}
