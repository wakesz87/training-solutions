package week07d05;
/*Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
A fenti osztályok értelemszerűen öröklődjenek egymásból és mindegyiknek implementálja a sebességek számát
és a váltó típusát. A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL.
Az alapértelmezett váltó típus (a Vehicle osztályban) MANUAL,
de a Car automatikus, míg a Motorcycle SEQUENTIAL. Az alapértelmezett sebesség szám 5. */

public class Car {
    TransmissionType trType= TransmissionType.MANUAL;
}


