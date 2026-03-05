import java.net.Socket;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        System.out.println("Ingrese tamaño de la matriz: ");
        int n = m.validarNumero(sc);
        boolean seguir = true;
        while (seguir) {
            int opt = 0;

            System.out.println("Bienvenido al Menu:");
            System.out.println("----------------------");
            System.out.println("INDIQUE A QUE PUNTO QUIERE INGRESAR");
            System.out.println("1.punto #1");
            System.out.println("2.punto #2");
            System.out.println("3.punto #3");
            System.out.println("4.punto #4");
            System.out.println("5.punto #5");
            System.out.println("6.punto #6");
            System.out.println("7.punto #7");
            System.out.println("8.punto #8");
            System.out.println("9.punto #9");
            System.out.println("10.punto #10");
            System.out.println("--------------------");
            System.out.println("indique una opcion: ");
            opt = m.validarNumero(sc);

            switch (opt) {
                case 1:
                    // System.out.println("hola");
                    m.LlamarMetodos();
                    break;
                case 2:

                    Productop2[][] matriz = m.iniciarMatrizp2(n);
                    m.llenarMatriz(matriz);
                    int total = m.sumarCantidad(matriz);

                    System.out.println("El total de inventario es: " + total);

                    break;
                case 3:
                    Libro[][] matriz3 = m.iniciarMatriz3(n);

                    m.llenarMatriz(matriz3);

                    Libro caro = m.libroMasCaro(matriz3);

                    System.out.println("El libro mas caro de la libreria es: ");
                    System.out.println("Nombre: " + caro.getTitulo());
                    System.out.println("Autor: " + caro.getAutor());
                    System.out.println("Su precio es: " + caro.getPrecio());

                    break;
                case 4:

                    Puestos[][] m4 = m.iniciarMatriz(n);

                    m.llenarMatriz(m4);
                    m.ordenarFilasPorPrecio(m4);

                    System.out.println("Puestos en orden por precio en cada fila: ");

                    for (int i = 0; i < m4.length; i++) {
                        for (int j = 0; j < m4[i].length; j++) {

                            System.out.println(
                                    "Asiento " + m4[i][j].getNumero() + " - Precio " + m4[i][j].getPrecio());

                        }

                    }

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:
                    System.out.println("Suerte es que le digo");
                    seguir = false;
                    break;

                default:
                    System.out.println("hasta luego mi cuate");
                    break;
            }

        }
    }

}