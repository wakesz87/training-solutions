package week15d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoronaVirusDataTest {
    private CoronaVirusData cvd = new CoronaVirusData();

    @Test
    public void testThreeLargest() throws IOException {
        InputStream is = CoronaVirusDataTest.class.getResourceAsStream("/coronadata.csv");
        InputStreamReader isr = new InputStreamReader(is);
        List<Data> three = cvd.getThreeLargest(isr);

        Assertions.assertEquals(3, three.size());
        Assertions.assertEquals("2020-48", three.get(0).getYearAndWeek());
        Assertions.assertEquals("2020-49", three.get(1).getYearAndWeek());
        Assertions.assertEquals("2020-46", three.get(2).getYearAndWeek());
    }

}