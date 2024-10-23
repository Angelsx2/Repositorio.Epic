import java.util.Scanner;
public class Factorial 
    {
        public static void main (String[]args)
       { Scanner entrada = new Scanner (System.in);
        int conta,facto,N, temp;
        System.out.println(".----------------:");
        System.out.println("NUMERO A FACTORIZAR");
        N = entrada.nextInt();
        System.out.println("Factores");
        System.out.println("1.2.3....."+N);
        conta =1;
        temp = N;
        while (temp>0)
        {
          conta*=temp--;
          System.out.println(conta);
          if (temp==0)
          System.out.print("Factorial" +":"+conta);
          
        }
        
        
    }
}