
package boletin5n7;
import java.util.Scanner;
public class Boletin5n7 {

    public static void main(String[] args) {
         Scanner rea = new Scanner(System.in);
        Figuras obx = new Figuras();
       System.out.println("menu \n  1 cuadrado \n 2 triangulo \n 3 circulo\n selecciona opcion");
       int op = rea.nextInt();
       obx.seleccionar(op);
    }
    
}
