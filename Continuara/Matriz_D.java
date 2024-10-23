import java.util.*;
public class Matriz_D
{
    public static void main (String []args)
    { Scanner e = new Scanner (System.in);
        int b,b2,f,c,n=0;
        int m [] [] = new int [11] [11];
        int m2 [] [] = new int [11] [11];
        int k1,k2 ;
        //b = e.nextInt();
        //b2 = b;
        while (n!=5)
        {
            
          b = new Random().nextInt(3);
        System.out.println("Filas Matriz A - B  : "+b);
          b2 = new Random().nextInt(3);
           System.out.println("columnas Matriz A - B :"+b2);
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 m2 [f] [c] =new Random().nextInt(20);
                 //m [f] [c] = e.nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz A :");
             System.out.println(" ");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)
             {
                 System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
             System.out.println("Orden Matriz B :");
             System.out.println(" ");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)
             {System.out.print(m2 [f] [c] + " ");
               }
               System.out.println();
            }
            System.out.println(" ");
             k1 = new Random().nextInt(10);
             k2 = new Random().nextInt(10);
            System.out.println("Escalar 1, Matriz A : "+k1);
            System.out.println(" ");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)             
             {
                 if (f==c)
                 System.out.print(k1*m [f] [c] + " ");
                 else 
                 System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            System.out.println(" ");
            System.out.println("Escalar 2, Matriz B : "+k2);
            System.out.println(" ");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)             
             {
                 if (f==c)
                 System.out.print(k2*m2 [f] [c] + " ");
                 else 
                 System.out.print(m2 [f] [c] + " ");
               }
               System.out.println();
            }
            System.out.println("Suma de matriz,diagonal principal Matriz A - B Escalada : "); 
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b2 ; c++)             
             {
                 if (f==c)
                 System.out.print(k2*m2[f] [c]+(k1*m [f] [c]) + " ");
                 else 
                 System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            System.out.println(" ");
          System.out.println("Salir      = 5 ");
          System.out.println("Continuar  = todo numero, ( no 5) ");
          n = e.nextInt();
        }
            }
      }