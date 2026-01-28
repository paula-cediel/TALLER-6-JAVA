import java.util.Scanner;

public class CalculadoraPromedios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        double suma = 0;

        System.out.print("Cantidad de notas: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nota " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / cantidad;

        if (promedio < 6)
            System.out.println("Reprobado");
        else if (promedio < 8)
            System.out.println("Aprobado");
        else
            System.out.println("Excelente");

        sc.close();
    }
}
