import java.util.*;
public class Suma_Matriz
{
    public static void main (String []args)
    { Scanner e = new Scanner (System.in);
        int b,b2,f,c,n=0;
        int m [] [] = new int [11] [11];
        int m2 [] [] = new int [11] [11];
        int m3 [] [] = new int [11] [11];
        //b = e.nextInt();
        //b2 = b;
          b = new Random().nextInt(3);
        System.out.println("Filas y columnas Matriz A : "+b);
          b2 = new Random().nextInt(3);
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 //m [f] [c] = e.nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
        System.out.println("Filas y columnas Matriz B : "+b2);
         for ( f=0 ; f<b2 ;f++)
         {
             for (c=0 ; c<b2 ; c++)
             {
                 m2 [f] [c] =new Random().nextInt(20);
                 //m2 [f] [c] = e.nextInt(20);
                 System.out.println("Matriz 2 ["+f+"] ["+c+"] : "+m2 [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
            for ( f=0 ; f<b2 ;f++)
         {
             for (c=0 ; c<b2 ; c++)
             {System.out.print(m2 [f] [c] + " ");
               }
               System.out.println();
            }
            if (b==b2)
            {
            System.out.println("Suma matriz A - B  :");
            for ( f=0 ; f<b ;f++)
            {
             for (c=0 ; c<b ; c++)
             {
                m3 [f] [c] = m [f] [c] - m2[f] [c];
                System.out.print(m3 [f] [c] + " ");
               }
               System.out.println();
            }
        }
        else 
            System.out.println("NO HAY IGUALDAD ☻ ");
    }
}