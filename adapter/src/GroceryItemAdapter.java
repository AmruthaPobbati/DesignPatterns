public class GroceryItemAdapter implements IItem{
    //my adaptee
    private final GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getItemName();
    }

    @Override
    public int getPrice() {
        return groceryItem.getPrice();
    }

    @Override
    public String getRestaurant() {
        return groceryItem.getStoreName();
    }

    @Override
    public String toString() {
        return groceryItem.toString();
    }
}
