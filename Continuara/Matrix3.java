import java.util.*;
public class Matrix3
{
    public static void main (String []args)
    {
        Scanner entrada = new Scanner (System.in);
        int m [] [] = new int [50] [50];
        int f,c,i,o,s;
        c=0;
        s = 0;
        f = new Random().nextInt(10);
        System.out.println("Tamaño de fila : "+f);
        System.out.println("Tamaño de columna : "+f);
        for ( i=0; i<f ; i++)
        {
            for ( o=0 ; o<f ; o++)
            {
                m [i] [o] = new Random().nextInt(20);
                System.out.println("Matriz [ " + i + "] [ "+ o + "]"+ " :");
                
        }
    }
    System.out.println("Matriz ");
    for ( i=0; i<f ; i++)
        {
            for (  o=0 ; o<f ; o++)
            {System.out.print(m [i] [o]+" ");
             s+=m[i] [o];
        }
        System.out.println();
    }
    System.out.print("Suma de matriz : "+s);
   }
}