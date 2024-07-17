public class DeliveryBoy {

    private final Restaurant restaurant;

    public DeliveryBoy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void pickUpOrderFromRestaurant() {
        System.out.println("Picking Food Order ");
        restaurant.getPackagedFood();
    }

    public void deliverFood() {
        System.out.println("Delivering Food Order");
    }
}
