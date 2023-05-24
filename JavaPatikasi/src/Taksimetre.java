import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tahmini kaç km gideceksiniz : ");
        int kacKm =scan.nextInt();
        int acilisUcret = 10;
        double kmBasina = 2.20;
        double total = (kmBasina*kacKm) + acilisUcret;
        if (total < 20 ) {
            total = 20;
        }
        System.out.println(total);
    }
}
