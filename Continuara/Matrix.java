import java.util.*;
import java.util.Random;
public class Matrix
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int m1 [] [] = new int [50] [50];
         int a,b,f,c;
         System.out.println("Filas de Matriz");
         a = entrada.nextInt();
         System.out.println("Columnas Matriz");
         b = entrada.nextInt();
         for ( f=0 ; f<a ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print("Matriz ["+f+"] ["+c+"] :");
                 m1[f] [c] =entrada.nextInt();
               }
            }
          /*  for ( f=0 ; f<a ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.println("Matriz ["+f+"] ["+c+"] :"+ m1 [f] [c]);
               }
            }*/
            System.out.println("Orden Matriz");
            for ( f=0 ; f<a ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print(m1 [f] [c] + " ");
               }
               System.out.println();
            }
        }
}