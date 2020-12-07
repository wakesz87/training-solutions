package week06d04;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }


    public List<Item> getItemsByMonth(int month) {

        List<Item> filteredList = new ArrayList<>();


        for (Item item : items) {

            if (item.getDate().getMonthValue() == month) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}

