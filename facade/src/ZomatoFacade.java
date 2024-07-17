public class ZomatoFacade {

    private final Restaurant restaurant;
    private final DeliveryTeam deliveryTeam;

    public ZomatoFacade(Restaurant restaurant, DeliveryTeam deliveryTeam) {
        this.restaurant = restaurant;
        this.deliveryTeam = deliveryTeam;
    }

    public void orderFood() {
        restaurant.acceptOrder();
        DeliveryBoy deliveryBoy = deliveryTeam.assignDeliveryBoy(restaurant);
        deliveryBoy.pickUpOrderFromRestaurant();
        deliveryBoy.deliverFood();
    }
}
