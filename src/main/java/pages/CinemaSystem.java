package pages;

public class CinemaSystem {
    // Fixed: Magic Numbers (Dispensables category)
    private static final double DISCOUNT_KIDS = 0.20;
    private static final double DISCOUNT_MEMBER = 0.10;

    public void processBooking(String movie, Ticket ticket, int age, boolean isMember) {
        // Fixed: Long Method (Bloater category) -> Logic is now modular
        double price = calculateFinalPrice(ticket.getBasePrice(), age, isMember);
        printTicket(movie, ticket.getType(), price);

        // Fixed: Coupler smell -> Passing data properly to the service
        LogService logger = new LogService("AUDIT LOG: ");
        logger.save(movie, price);
    }

    private double calculateFinalPrice(double price, int age, boolean isMember) {
        double finalPrice = price;
        if (age < 18) finalPrice -= (finalPrice * DISCOUNT_KIDS);
        if (isMember) finalPrice -= (finalPrice * DISCOUNT_MEMBER);
        return finalPrice;
    }

    private void printTicket(String movie, String type, double price) {
        System.out.println("********** CINEMA TICKET **********");
        System.out.println("Movie: " + movie);
        System.out.println("Ticket Type: " + type);
        System.out.println("Final Total: $" + price);
        System.out.println("***********************************");
    }
}