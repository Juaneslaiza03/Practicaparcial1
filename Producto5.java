
import java.util.Scanner;

public class Producto5 {

    Scanner sc = new Scanner(System.in);
    private int ID;
    private String Nombre;
    private Double Precio;
    private int Stock;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Producto5[][] Llenarmatriz(Producto5[][] m) {
        Producto5 o = new Producto5();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el ID del producto");
                o.setID(sc.nextInt());
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el Stock del Producto");
                o.setStock(sc.nextInt());
                m[i][j] = o;

            }
        }
        return m;
    }

    public Producto5[][] SumarStock(Producto5[][] m1, Producto5[][] m2, Producto5[][] mt) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {

                for (int j2 = 0; j2 < m2.length; j2++) {
                    for (int k = 0; k < m2.length; k++) {
                        if (m1[i][j].getID() == m2[j2][k].getID()) {
                            mt[i][j].setStock(m1[i][j].getStock() + m2[j2][k].getStock());
                            m2[j2][k].setStock(0);

                        }
                        mt[i][j].setID(m1[i][j].getID());
                        mt[i][j].setNombre(m1[i][j].getNombre());
                        mt[i][j].setPrecio(m1[i][j].getPrecio());

                    }
                }
            }
        }
        return mt;
    }

    public void Mostrarmatriz(Producto5[][] mt) {
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                System.out.println("ID: " + mt[i][j].getID());
                System.out.println("Nombre: " + mt[i][j].getNombre());
                System.out.println("Precio: " + mt[i][j].getPrecio());
                System.out.println("Stock: " + mt[i][j].getStock());
            }
        }
    }

}
