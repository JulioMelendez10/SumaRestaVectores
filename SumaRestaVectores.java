import java.util.Scanner;

public class SumaRestaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar dos valores para el primer vector
        System.out.print("Ingrese el primer valor del vector 1: ");
        int valor1Vector1 = scanner.nextInt();
        System.out.print("Ingrese el segundo valor del vector 1: ");
        int valor2Vector1 = scanner.nextInt();

        // Ingresar dos valores para el segundo vector
        System.out.print("Ingrese el primer valor del vector 2: ");
        int valor1Vector2 = scanner.nextInt();
        System.out.print("Ingrese el segundo valor del vector 2: ");
        int valor2Vector2 = scanner.nextInt();

        // Realizar la suma de los vectores
        int suma1 = valor1Vector1 + valor1Vector2;
        int suma2 = valor2Vector1 + valor2Vector2;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma de los vectores: [" + suma1 + ", " + suma2 + "]");

        scanner.close();
    }
}
