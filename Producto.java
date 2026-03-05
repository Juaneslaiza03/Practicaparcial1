public class Producto {
    String Nombre;
    double Precio;
    boolean Disponibilidad;

    public Producto(String nombre, double precio, boolean disponibilidad) {
        Nombre = nombre;
        Precio = precio;
        Disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }

}
