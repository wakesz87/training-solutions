package week07d05;

/*Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
A fenti osztályok értelemszerűen öröklődjenek egymásból és mindegyiknek implementálja a sebességek számát
és a váltó típusát. A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL.
Az alapértelmezett váltó típus (a Vehicle osztályban) MANUAL,
de a Car automatikus, míg a Motorcycle SEQUENTIAL. Az alapértelmezett sebesség szám 5. */

public class Vehicle {
    private int numberOfGears=5;
    private TransmissionType trType = TransmissionType.MANUAL;

    public Vehicle() {
    }

    public Vehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Vehicle(TransmissionType trType) {
        this.trType = trType;
    }

    public Vehicle(int numberOfGears, TransmissionType trType) {
        this.numberOfGears = numberOfGears;
        this.trType = trType;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setTrType(TransmissionType trType) {
        this.trType = trType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTrType() {
        return trType;
    }
}
