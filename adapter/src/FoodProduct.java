public class FoodProduct implements IItem {

    private String itemName;
    private int price;
    private String restaurant;

    public FoodProduct(String itemName, int price, String restaurant) {
        this.itemName = itemName;
        this.price = price;
        this.restaurant = restaurant;
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
    public String getRestaurant() {
        return restaurant;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
