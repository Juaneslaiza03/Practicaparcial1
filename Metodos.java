import java.util.Scanner;

public class Metodos {
    public void LlamarMetodos() {
        System.out.println("hola mundo");
    }

    public Puestos[][] iniciarMatriz(int n) {
        return new Puestos[n][n];
    }

    public void llenarMatriz(Puestos[][] matriz) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a llenar la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el numero de asiento: ");
                int numero = sc.nextInt();
                System.out.println("Ingrese el numero de la fila: ");
                int fila = sc.nextInt();
                System.out.println("Ingrese el precio: ");
                double precio = sc.nextDouble();

                Puestos o = new Puestos();
                o.setNumero(numero);
                o.setFila(fila);
                o.setPrecio(precio);

                matriz[i][j] = o;
            }
        }
    }

    public void ordenarFilasPorPrecio(Puestos[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                for (int k = 0; k < matriz[i].length - 1 - j; k++) {

                    if (matriz[i][k].getPrecio() > matriz[i][k + 1].getPrecio()) {

                        Puestos temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;

                    }

                }

            }
        }
    }

    public Productop2[][] iniciarMatrizp2(int n) {
        return new Productop2[n][n];
    }

    public void llenarMatriz(Productop2[][] matriz) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Ingrese el producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese la cantidad de productos: ");
                int cantidad = sc.nextInt();

                Productop2 o = new Productop2();

                o.setNombre(nombre);
                o.setCantidad(cantidad);

                matriz[i][j] = o;
            }
        }
    }

    public int sumarCantidad(Productop2[][] matriz) {

        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                total = total + matriz[i][j].getCantidad();

            }
        }
        return total;
    }

    public int validarNumero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor digite un numero no ve que son opiociones..");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Libro[][] iniciarMatriz3(int n) {
        return new Libro[n][n];

    }

    public void llenarMatriz(Libro[][] matriz) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a iniciar con el inventario de libros: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa el titulo del libro: ");
                String titulo = sc.next();
                System.out.println("Ingrese el autor del libro: ");
                String autor = sc.next();
                System.out.println("Ingrese el prcio del libro:");
                double precio = sc.nextDouble();

                Libro libro = new Libro();
                libro.setTitulo(titulo);
                libro.setAutor(autor);
                libro.setPrecio(precio);

                matriz[i][j] = libro;

            }
        }
    }

    public Libro libroMasCaro(Libro[][] matriz) {

        Libro masCaro = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j].getPrecio() > masCaro.getPrecio()) {
                    masCaro = matriz[i][j];

                }
            }
        }
        return masCaro;
    }
}
