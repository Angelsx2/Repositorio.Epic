import java.util.*;
public class vecty3
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Varia [] = new int [11];
         int n,s,t;
         s = 0;
         Varia [0] = 10;
         Varia [1] = 5+ Varia[0]-Varia[3];
         Varia [2] = 100;
         Varia [3] = 12-Varia[7]-Varia[8];
         Varia [4] = 3+Varia[5];
         Varia [5] = 7;
         Varia [6] = 9+Varia[7];
         Varia [7] = 1;
         Varia [8] = 1;
         Varia [9] = 42;
         for (int i=0;i<10;i++)
         System.out.println("Vectores posicion [" + i + "] : " + Varia [i]);
        }
    }