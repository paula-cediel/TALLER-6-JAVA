import java.util.Scanner;

public class ControlAsistencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;

        System.out.print("Número de estudiantes: ");
        cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.print("Presente (P) o Ausente (A): ");
            String estado = sc.nextLine();

            System.out.println(nombre + " - " + estado);
        }

        sc.close();
    }
}
