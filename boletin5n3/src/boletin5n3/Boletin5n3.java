
package boletin5n3;

import java.util.Scanner;


public class Boletin5n3 {

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        float v;
       System.out.println("teclea numero ");
       v = sc.nextFloat();
       
       if(v>0){
           System.out.println("+");
       }
       else if(v<0){
           System.out.println("-");
       }
       else {
           System.out.println("0");
       }
    }
    
}
