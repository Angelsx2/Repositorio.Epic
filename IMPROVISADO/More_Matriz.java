import java.util.*;
public class More_Matriz
{
    static Scanner e = new Scanner (System.in);
    static int t;
    public static int Notas[] [] = new int [t] [t];
    public static String Nombre [] = new String [t];
    public static Object P [] [] = new Object [11] [11];
    public static void Text(int t)
    {
        int Notas [] [] = new int [t] [5];
        String Nombre [] = new String [t];
        for (int f=0 ; f<t ; f++)
        {
            System.out.println("Nombre "+ (f+1)+ " : ");
                Nombre [f] = e.next();
            for (int c = 0 ; c<3 ; c++)
            {
                System.out.println("Nota "+ (c+1) + " : ");
                Notas [f] [c]= e.nextInt();
                Notas [f] [3]+=Notas [f] [c];
            }
        }
        System.out.println("Nombre\tNota_1\tNota_2\tNota_3\tFinal");
        for (int f=0 ; f<t ; f++)
        {
            System.out.print(Nombre [f] + "\t");
            for (int c = 0 ; c<4 ; c++)
            {
                if (c==3)
                Notas [f] [c] = Notas [f] [c]/3;
                System.out.print(Notas [f] [c] + "\t");
            }
            System.out.println();
        }
    }
}