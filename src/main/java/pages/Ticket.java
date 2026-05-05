package pages;

// Aplicamos el patrón Strategy para eliminar el Switch
public interface Ticket {
    double getBasePrice();
    String getType();
}

class RegularTicket implements Ticket {
    public double getBasePrice() { return 10.0; }
    public String getType() { return "Regular"; }
}

class VIPTicket implements Ticket {
    public double getBasePrice() { return 15.0; }
    public String getType() { return "VIP"; }
}

class ThreeDTicket implements Ticket {
    public double getBasePrice() { return 12.5; }
    public String getType() { return "3D"; }
}