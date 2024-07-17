public class Restaurant {

    private DeliveryTeam deliveryTeam;

    public void acceptOrder() {
        System.out.println("Accepted Order");
        prepareFood();
        packFood();
    }

    public void prepareFood() {
        System.out.println("Preparing Food");
    }

    public void packFood() {
        System.out.println("Packing Food");
    }

    public void getPackagedFood() {

    }
}
