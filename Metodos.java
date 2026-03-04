import java.util.Scanner;

public class Metodos {
    public void LlamarMetodos(){
        System.out.println("hola mundo");
    }
     public  Puestos[][] iniciarMatriz(int n) {
        return new Puestos[n][n];
    }

    public  void llenarMatriz(Puestos[][] matriz){
        
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
    public  void
    ordenarFilasPorPrecio(Puestos[][] matriz){

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
}
