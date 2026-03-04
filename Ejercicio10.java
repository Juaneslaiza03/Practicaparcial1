import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vendedores = 5;
        int meses = 12;

        String[] nombres = new String[vendedores];
        double[][] ventas = new double[vendedores][meses];

        // Pedir nombres de los vendedores
        for (int i = 0; i < vendedores; i++) {
            System.out.print("Ingrese el nombre del vendedor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        // Pedir ventas mensuales
        for (int i = 0; i < vendedores; i++) {
            System.out.println("\nVentas de " + nombres[i] + ":");
            for (int j = 0; j < meses; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }

        double mayorVenta = 0;
        String mejorVendedor = "";

        // Sumar ventas por vendedor y comparar
        for (int i = 0; i < vendedores; i++) {
            double sumaAnual = 0;

            for (int j = 0; j < meses; j++) {
                sumaAnual += ventas[i][j];
            }

            System.out.println("\nTotal anual de " + nombres[i] + ": " + sumaAnual);

            if (i == 0 || sumaAnual > mayorVenta) {
                mayorVenta = sumaAnual;
                mejorVendedor = nombres[i];
            }
        }

        // Resultado final
        System.out.println("\n==============================");
        System.out.println("Vendedor con más ventas:");
        System.out.println("Nombre: " + mejorVendedor);
        System.out.println("Total vendido: " + mayorVenta);
        System.out.println("==============================");

        sc.close();
    }
}