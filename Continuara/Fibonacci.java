import java.util.Scanner;
public class Fibonacci 
    {
        public static void main (String[]args)
       { Scanner entrada = new Scanner (System.in);
        int conta,N, temp;
        System.out.println(".----------------:");
        System.out.println("Secuencia Fibonacci");
        N = entrada.nextInt();
        
        conta =0;
        temp = 1;
        System.out.println("0");
        System.out.println("1");
        while (temp<N)
        {
          System.out.println(conta+=temp);
          System.out.println(temp+=conta);
          
          
        }
        
        
    }
}