import java.util.Scanner;
public class Fibonacci2 
    {
        public static void main (String[]args)
       { Scanner entrada = new Scanner (System.in);
        int a,e,i,o,u;
        a=1;
        e=1;
        System.out.println(".----------------:");
        System.out.println("Secuencia Fibonacci");
        u = entrada.nextInt();
        for (i=1 ; i<=u ;i++)
        { 
          System.out.println(i + ":  " + a);
          o=a+e;
          a=e;
          e=o;
        }
        
        
    }
}