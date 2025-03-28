import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class ExamenApli{
    public static void main(String[] args){

    //Primera serie : Crea un algoritmo para resolver las siguientes ecuaciones matematicas en java.

        // 1.Ecuacion x + 3x 
        System.out.println(" 1.Ecuacion x + 3x ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de X: ");
        double Oper1 = sc.nextDouble();

        double Resu =  Oper1 + (3 * Oper1);
        System.out.println("El resultado de la ecuacion es : " + Resu);
        System.out.println("");

        // 2.Resuelve la siguiente ecuacion 2x - 5 , valor de X = 5
        System.out.println("2.Resuelve la siguiente ecuacion 2x - 5 , valor de X = 5");
        int X = 5;
        int Resu2 = (2 * X) - 5;

        System.out.println("El resultado de la ecuacion es : " + Resu2);
        System.out.println("");

        // 3.Resuelve la siguiente ecuacion 2/x + x al cuadrado

        System.out.println("3.Resuelve la siguiente ecuacion 2/x + x al cuadrado");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce el valor de X: ");
        double Oper2 = sc2.nextDouble();

        double Resu3 = (2 / Oper2) + (Oper2 * Oper2);
        System.out.println("El resultado de la ecuacion es : " + Resu3);
        System.out.println("");

        // 4.Resuleve la siguiente ecuacion x + 2x + 3x 
        System.out.println("4.Resuleve la siguiente ecuacion x + 2x + 3x");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce el valor de X: ");    
        double Oper3 = sc3.nextDouble();
        double Resu4 = Oper3 + (2 * Oper3) + (3 * Oper3);
        System.out.println("El resultado de la ecuacion es : " + Resu4);

        // Serie 2 Crea un programa en bucle con las siguientes funcionalidades y estructuras
        System.out.println(" Serie 2 Crea un programa en bucle con las siguientes funcionalidades y estructuras");

        Scanner scanner = new Scanner(System.in);
        int opcion;
         
        do{
        // Menu de opciones
        System.out.println(" | [1] Calcular promedio ");
        System.out.println(" | [2] Saludar por tu nombre");
        System.out.println("| [3] Di Hola mundo ");
        System.out.println("| [4] Salir ");
        System.out.print("Elige una opcion: ");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                // Calcular promedio
                Scanner prom = new Scanner(System.in);
                System.out.println("Cuantos numeros deseas promediar : ");
                int numeros = prom.nextInt();

                double suma = 0;
                for (int i = 0; i < numeros; i++){
                    System.out.print("Introduce el numero " + (i + 1) + ": ");
                    double num = prom.nextDouble();
                    suma += num;
                }
                double promedio = suma / numeros;
                System.out.println("El promedio es: " + promedio);




                break;
            case 2:
                // Saludar por tu nombre
                System.out.println("Saludar por tu nombre");
                System.out.print("Introduce tu nombre: ");
                String nombre = scanner.next();
                System.out.println("Hola, " + nombre + "!!!!");
                
                break;
            case 3:
                // Di Hola mundo
                System.out.println("Hola mundo!!!");
                break;

            case 4:
                // Salir
                System.out.println("Saliendo del programa... byeeee!!");
                break;
        
            default:System.out.println("Opcion no valida :( ");
                break;
        }
        }while(opcion != 4);
        opcion = scanner.nextInt();


        
        
    }
}