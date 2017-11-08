
package boletin5n7;
import java.util.Scanner;
public class Figuras {
    float l,b,h,r,ac,at,aci;
    final float PI=3.14f;
    Scanner sc = new Scanner(System.in);
    public void seleccionar (int op){
        switch(op){
            case 1: System.out.println("introduce lado"); l= sc.nextInt();ac=l*l; System.out.println("area del cuadrado = "+ac);
            break;
            case 2:System.out.println("introduce base"); b= sc.nextInt();System.out.println("introduce altura"); h= sc.nextInt();at=b*h/2; System.out.println("area del triangulo = "+at);
            break;
            case 3:System.out.println("introduce radio"); r= sc.nextInt();aci=r*r*PI; System.out.println("area del circulo = "+aci);
            break;
        default : System.out.println("error");    
            
        }
    }
}
