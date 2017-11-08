
package boletin5n2;
import java.util.Scanner;

public class Boletin5n2 {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        short w,v,s;
       System.out.println("teclea numero 1 ");
       v = sc.nextShort();
           System.out.println("teclea numero 2 ");
       w = sc.nextShort();
       s =     (short) (v+w);
       System.out.println("suma"+ s);
       if(v>=w){
           System.out.println("resta "+ (v-w));
       }
    }
    
}
