import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
    List<IItem> itemsInStore = new ArrayList<>();

    public void addItem(IItem iItem) {
        itemsInStore.add(iItem);
    }

    public void showStoreItems() {
        itemsInStore.forEach(System.out::println);
    }
}
