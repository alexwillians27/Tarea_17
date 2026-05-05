package pages;

// Strategy Pattern to handle different ticket types
public interface Ticket {
    double getBasePrice();
    String getType();
}

class RegularTicket implements Ticket {
    @Override public double getBasePrice() { return 10.0; }
    @Override public String getType() { return "Regular"; }
}

class VIPTicket implements Ticket {
    @Override public double getBasePrice() { return 15.0; }
    @Override public String getType() { return "VIP"; }
}