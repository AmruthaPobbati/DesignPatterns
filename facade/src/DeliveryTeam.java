public class DeliveryTeam {

    public DeliveryBoy assignDeliveryBoy(Restaurant restaurant) {
        System.out.println("Assigning DeliveryBoy");
        return new DeliveryBoy(restaurant);
    }
}
