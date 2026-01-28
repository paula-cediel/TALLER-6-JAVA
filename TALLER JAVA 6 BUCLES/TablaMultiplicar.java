import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número (1-10): ");
        numero = sc.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.print("Número inválido. Ingrese de nuevo: ");
            numero = sc.nextInt();
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        sc.close();
    }
}
