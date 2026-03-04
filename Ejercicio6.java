public class Ejercicio6{
    public static Producto[][] FiltrarDisponibles(Producto[][] m){
        int f=m.length;
        int c=m[0].length;
        Producto[][] disponibles=new Producto[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j].Disponibilidad==true){
                    disponibles[i][j]=m[i][j];
                }
            }
        }
        return disponibles;
    }
}