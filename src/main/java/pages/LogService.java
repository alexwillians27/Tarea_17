package pages;

public class LogService {
    private final String header; // Private field to ensure encapsulation

    public LogService(String header) {
        this.header = header;
    }

    public void save(String movie, double price) {
        System.out.println(header + " Movie: " + movie + " | Profit: " + price);
    }
}