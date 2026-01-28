import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcion;

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= saldo) saldo -= retiro;
                    else System.out.println("Saldo insuficiente");
                    break;
                case 3:
                    System.out.print("Monto a depositar: ");
                    saldo += sc.nextDouble();
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
