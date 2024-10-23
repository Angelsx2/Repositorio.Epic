import java.util.*;
import java.util.Random;
public class vecty4
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         long Varia [] = new long [1000000];
         long n;
         System.out.println("Tamaño del vector :");
         n = new Random().nextInt(100000);
         for ( int i=0;i<n;i++)
         Varia[i] = new Random().nextInt(10000);
         for (int i=0;i<n;i++)
         System.out.println("Vectores posicion [" + i + "] : " + Varia [i]);
        }
    }