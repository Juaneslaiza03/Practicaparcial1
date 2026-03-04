import java.util.Scanner;

public class main {
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Metodos m= new Metodos();

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
        opt=sc.nextInt();
         
        switch (opt) {
            case 1:
               // System.out.println("hola");
                m.LlamarMetodos();
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 4:
                
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

        
            default:
                break;
        }

    }
}