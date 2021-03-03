//A GitHubon a examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv
// fájl tartalmazza a magyar városok listáját. Add vissza a leghosszabb nevű várost!
package week13d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TownsTest {

    @Test
    public void testLongestTownName(){
        Path path = Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv");
        Assertions.assertEquals("Jászfelsőszentgyörgy", new Towns().longestTownName(path));
    }

}