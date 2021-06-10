/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variables enteras y boleana que nos permimitiran realizar los calculos
         */
        int opcion=0, numero1, numero2, suma=0, divison=0, resta=0;
        boolean salir = false;

        /**
         * Ciclo do while para repetir el ingreso de datos y los calculos hasta que el usuario desee salir
         */
        do{
            System.out.println("Bienvenido");
            System.out.println("Ingresa el primer numero");
            numero1 = scanner.nextInt();
            System.out.println("Ingresa el segundo numero");
            numero2 = scanner.nextInt();
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1) Sumar");
            System.out.println("2) Dividir");
            System.out.println("3) Salir");
            opcion = scanner.nextInt();
            /**
             * Segun la opcion del usuario se efectuaran los calculos de suma y division, y podra salir
             */
            switch (opcion) {
                case 1:
                    suma = numero1+numero2;

                    /**
                     * Se imprime en pantalla el resultado del calculo solicitado
                     */
                    System.out.println("El resultado de sumar "+numero1+" y "+numero2+" es: "+suma);
                    break;
                
                case 2:
                    divison = numero1/numero2;

                    /**
                     * Se imprime en pantalla el resultado del calculo solicitado
                     */
                    System.out.println("El resultado de dividir "+numero1+ " dentro de "+numero2+" es: "+divison);
                    break;

                case 3:
                    salir = true;

                    /**
                     * El usuario saldra del programa
                     */
                    System.out.println("Estás saliendo, hasta luego");
                    break;

                default:
                    /**
                     * Mensaje generico para indicar al usuario que ha ingresado una opcion invalida
                     */
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }while(salir==false);
    }
}
