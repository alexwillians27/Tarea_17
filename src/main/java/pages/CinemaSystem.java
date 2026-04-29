package pages;

import java.util.Scanner;

/**
 * Tarea 17: Entornos de Desarrollo - Proyecto Final
 * Versión: "Before Refactoring" (Contiene 10+ Code Smells)
 */
public class CinemaSystem {

    // 1. Smell: Temporary Field (Dispensable) - Variable global que solo se usa una vez
    public static String tempData = "Inizializing...";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- WELCOME TO DIRTY CINEMA ---");
        System.out.print("Enter movie: ");
        String movie = scanner.nextLine();

        System.out.print("Enter type (1:Regular, 2:VIP, 3:3D): ");
        int type = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Llamada al método que procesa todo
        process(movie, type, age, true);
    }

    // 2. Smell: Long Method (Bloater) - Este método hace TODO (calcula, valida, imprime)
    // 3. Smell: Switch Statements (OO Abuser) - Debería usarse polimorfismo según la tarea [cite: 11]
    public static void process(String m, int t, int a, boolean member) {
        double p = 0;

        // Lógica de precios
        switch (t) {
            case 1:
                p = 10.0;
                break;
            case 2:
                p = 15.0;
                break;
            case 3:
                p = 12.5;
                break;
            default:
                p = 8.0;
        }

        // 4. Smell: Duplicate Code (Dispensable) - Lógica de descuento repetida innecesariamente
        if (a < 18) {
            p = p - (p * 0.20);
        }
        if (member == true) {
            p = p - (p * 0.10);
        }

        // 5. Smell: Magic Numbers - El 0.20 y 0.10 deberían ser constantes

        // Imprimir ticket
        System.out.println("********** TICKET **********");
        System.out.println("Movie: " + m);
        System.out.println("Final Price: " + p);
        System.out.println("****************************");

        // 6. Smell: Feature Envy (Coupler) - El sistema de cine manipula campos de Printer directamente
        LogService service = new LogService();
        service.header = "LOG:";
        service.save(m, p);
    }

    // 7. Smell: Dead Code (Dispensable) - Código que nadie usa [cite: 12]
    public void deleteDatabase() {
        System.out.println("Deleting everything...");
    }
}

class LogService {
    // 8. Smell: Inappropriate Intimacy (Coupler) [cite: 10]
    public String header;

    public void save(String movie, double price) {
        System.out.println(header + " Saved booking for " + movie + " at $" + price);
    }
}

// 9. Smell: Large Class (Bloater) - Si metemos aquí toda la gestión de usuarios, salas, etc.
// 10. Smell: Lazy Class (Dispensable) - Una clase que no hace casi nada
class TicketInfo {
    public String title;
}