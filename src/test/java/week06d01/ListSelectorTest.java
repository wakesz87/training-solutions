package week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {
    @Test

    public void listIsNull() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ListSelector lS = new ListSelector();
            List<String> list = new ArrayList<>();
            list = null;
            lS.listSelector(list);});
        assertEquals("List is null!", ex.getMessage());
    }

    @Test
    public void listIsEmpty() {

        ListSelector lS = new ListSelector();
        List<String> list = new ArrayList<>();
        assertEquals("", lS.listSelector(list));
    }


    @Test
    public void listIsnotEmpty() {

        ListSelector lS = new ListSelector();
        List<String> list = new ArrayList<>();
        list.add("alfa");
        list.add("beta");
        list.add("gamma");
        list.add("delta");
        list.add("ypszilon");


        assertEquals("[alfagammaypszilon]", lS.listSelector(list));
    }
}