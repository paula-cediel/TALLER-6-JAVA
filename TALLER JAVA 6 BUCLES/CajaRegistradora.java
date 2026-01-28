import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double total = 0;
        double pago;

        do {
            System.out.println("=== MENÚ COMIDA RÁPIDA ===");
            System.out.println("1. Hamburguesa $50");
            System.out.println("2. Papas $30");
            System.out.println("3. Refresco $20");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: total += 50; break;
                case 2: total += 30; break;
                case 3: total += 20; break;
                case 4: break;
                default: System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        System.out.println("Total a pagar: $" + total);
        System.out.print("Ingrese el pago: ");
        pago = sc.nextDouble();

        if (pago >= total) {
            System.out.println("Cambio: $" + (pago - total));
        } else {
            System.out.println("Pago insuficiente");
        }

        sc.close();
    }
}
