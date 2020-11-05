package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerfomanceTest {

    public static void main(String[] args) {
        Perfomance performance = new Perfomance("Queen", LocalDate.of(1980, 06,02), LocalTime.of(18, 00), LocalTime.of(20, 00));
        System.out.println(performance.getInfo());
    }
}
