import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
        String contrasena = "";

        System.out.print("Longitud de la contraseña: ");
        int longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            int index = r.nextInt(caracteres.length());
            contrasena += caracteres.charAt(index);
        }

        System.out.println("Contraseña generada: " + contrasena);
        sc.close();
    }
}
