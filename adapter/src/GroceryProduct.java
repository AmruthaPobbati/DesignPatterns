public class GroceryProduct implements GroceryItem {
    private String itemName;
    private int price;
    private String storeName;

    public GroceryProduct(String itemName, int price, String storeName) {
        this.itemName = itemName;
        this.price = price;
        this.storeName = storeName;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", storeName='" + storeName + '\'' +
                '}';
    }
}
