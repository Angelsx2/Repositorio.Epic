import java.util.*;
public class Matriz_Num
{
    public static void main (String []args)
    { 
        Scanner e = new Scanner (System.in);
        int m [] [] = new int [20] [20];
        int r [] = new int [10];
        int i,f,c;
        i=0;
        while (i<5)
        {
        i = new Random().nextInt(6);
        System.out.println("Matriz tamaño : "+i);
        r [0] = 0;
        r [1] = 0;
        r [2] = 0;
        r [3] = 0;
        r [4] = 0;
        for (f=0 ; f<i ; f++)
        {
          for (c=0 ; c<i ; c++)
          {
             m [f] [c] = new Random().nextInt(15);
             System.out.println("Posicion ["+f+"] ["+c+"] : "+m [f] [c]);
             if (m [f] [c]%2==0)
             r [0] = r [0] +1;
             if  (m [f] [c]%2>0)
             r [1] = r [1] +1;
             if  (m [f] [c]>0)
             r [2] = r [2] +1;
             if (m [f] [c]<0)
             r [3] = r [3] +1;
            }
        }
        System.out.println("      ");
        System.out.println("Cantidad pares     : "+ r [0]);
        System.out.println("Cantidad impares   : "+ r [1]);
        System.out.println("Cantidad positivos : "+ r [2]);
        System.out.println("Cantidad negativos : "+ r [3]);
        System.out.println("¿Cargar nuevamente? ");
        System.out.println("si = 1   No = 5 ");
        i = e.nextInt();
       }
    }
}