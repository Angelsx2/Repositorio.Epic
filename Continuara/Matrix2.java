import java.util.*;
public class Matrix2
{
    public static void main (String []args)
    {
        Scanner entrada = new Scanner (System.in);
        int m [] [] = new int [50] [50];
        int f,c,i,o;
        System.out.print("Tamaño de fila :");
        f = entrada.nextInt();
        System.out.print("Tamaño de columna :");
         c = entrada.nextInt();
        for ( i=0; i<f ; i++)
        {
            for ( o=0 ; o<c ; o++)
            {System.out.print("Matriz [ " + i + "] [ "+ o + "]"+ " :");
                m [i] [o] = entrada.nextInt();
        }
    }
    System.out.println("Matriz ");
    for ( i=0; i<f ; i++)
        {
            for (  o=0 ; o<c ; o++)
            {System.out.print(m [i] [o]+" ");
        }
        System.out.println();
    }
    
   }
}