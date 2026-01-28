import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precio;

        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        for (int i = 10; i <= 50; i += 10) {
            double descuento = precio * i / 100;
            double finalPrecio = precio - descuento;
            System.out.println("Descuento " + i + "%: $" + finalPrecio);
        }

        sc.close();
    }
}
