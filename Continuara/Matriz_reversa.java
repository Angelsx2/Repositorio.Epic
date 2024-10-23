import java.util.*;
public class Matriz_reversa
{
    public static void main (String []args)
    {  
        Scanner e = new Scanner (System.in);
        int m [] [] = new int [11] [11];
        int b,f,c,s;
        s=0;
        b = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+b);
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
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
            System.out.println("Secundaria : ");
         for ( f=0 ; f<b ;f++)
         {
             c = b-1;
                 s+=m[f] [c];
                 System.out.println("["+f+"] ["+c+"] : ");
                 
          }
            System.out.println("Suma :  "+s);
    }
}