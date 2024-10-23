import java.util.*;
public class S_F_Matriz
{
    public static void main (String []args)
    { 
        Scanner e = new Scanner (System.in);
        int m[] [] = new int [11] [11];
        int r [] = new int [20];
        int f,c,t,l;
        int x=0;
         t = new Random().nextInt(5);
        System.out.println("Filas Matriz  : "+t);
        l = new Random().nextInt(10);
        System.out.println("columnas Matriz  : "+l);
        //t = e.nextInt();
        //l = e.nextInt();
         for ( f=0 ; f<t ;f++)
         {
             for (c=0 ; c<l ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 //m [f] [c] = e.nextInt();
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
            System.out.println("Matriz ordenada ");
            for ( f=0 ; f<t ;f++)
         {
             for (c=0 ; c<l ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            for (f=0 ; f<t ; f++)
            {
                for (c=0 ; c<l ; c++)
                {
                    if ((f<t) && (c==0))
                r [0] = r[0] + m[f] [c];
                if ((f<t) && (c==1))
                r [1] = r[1] + m[f] [c];
                if ((f<t) && (c==2))
                r [2] = r[2] + m[f] [c];
                if ((f<t) && (c==3))
                r [3] = r[3] + m[f] [c];
                if ((f<t) && (c==4))
                r [4] = r[4] + m[f] [c];
                if ((f<t) && (c==5))
                r [5] = r[5] + m[f] [c];
                if ((f<t) && (c==6))
                r [6] = r[6] + m[f] [c];
                //System.out.println(" Suma fila" + f +" : "+r[x]);
            }
            //System.out.println(" Suma columna "+c+" : "+r[0]);
             /*System.out.println(" Suma fila 2 : "+r[1]);
             System.out.println(" Suma fila 3 : "+r[2]);*/ 
       }
       System.out.println(" Suma columna 1 : "+r[0]);
       System.out.println(" Suma columna 2 : "+r[1]);
       System.out.println(" Suma columna 3 : "+r[2]);
       System.out.println(" Suma columna 4 : "+r[3]);
       System.out.println(" Suma columna 5 : "+r[4]);
       System.out.println(" Suma columna 6 : "+r[5]);
       System.out.println(" Suma columna 7 : "+r[6]);
    }
}