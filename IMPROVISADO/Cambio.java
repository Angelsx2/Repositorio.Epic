import java.util.*;
public class Cambio
{
    static Scanner e = new Scanner (System.in);
    static Object Planilla [] [];
    public static void N_final(Object a, Object b, Object c){
        double aa,bb,cc;
        aa = parse.Double(a);
    }
    public static void Text(int t)
    {
        Object Planilla [] [] = new Object [5] [5];
        int c=0;
        for (int f=0 ; f<t ; f++)
        {
            System.out.println("Nombre "+ (f+1)+ " : ");
                Planilla [f] [0] = e.next();
            for ( c = 1 ; c<4 ; c++)
            {
                System.out.println("Nota "+ (c) + " : ");
                Planilla [f] [c]= e.nextInt();
            }
        }
        System.out.println("Nombre\tNota_1\tNota_2\tNota_3\tFinal");
        for (int f=0 ; f<t ; f++)
        {
            for ( c = 0 ; c<4 ; c++)
            {
                System.out.print(Planilla [f] [c] + "\t");
            }
            System.out.println();
        }
    }
}