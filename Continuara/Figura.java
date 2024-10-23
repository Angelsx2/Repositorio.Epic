import java.util.*;
import java.util.Random;
public class Figura
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int m1 [] [] = new int [50] [50];
         int a,b,f=0,c=0;
         String p ="*";
         b=1;
         System.out.println("Numero a figura");
         a = entrada.nextInt();
         /*while (b<=a)
         {
             System.out.println("*");
             b =  b+1;
             if (b==a){
                 for (int i=0 ; i<a-1 ; i++)
             System.out.print("* ");
            }
          }*/
          f = a;
          c = b;
          while (a>b){
          while (c<=f+2){
            System.out.print("*");
            
            f =f-1;
            }
            b = b+1;
            f = f+4;
            System.out.print("\n");
        }
        System.out.println(" *");
        }
    }