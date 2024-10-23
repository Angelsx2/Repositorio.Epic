import java.util.*;
public class Letters
{
    public static void main (String []args)
    { Scanner e = new Scanner (System.in);
        int a,c=0;
        char v [] = new char [13];
        int b;
        a = new Random().nextInt(13);
        for (int i=0 ; i<a ; i++)
        {
            System.out.println("Puesto "+(i+1)+" : ");
            v [i] = e.next().charAt(0);
        }
        System.out.println("Letrita? : ");
        b = e.next().charAt(0);
        for (int i=0 ; i<a ; i++)
        {
            if (v [i]==b)
            {
                c = c+1;
                 b=v[i];
            System.out.println("Posicion :" +(i+1));
        }else if(i==a)
        {
            System.out.println("No hay letrita "+b+" T_T");
        }
        }
        if ( c>1)
        System.out.println("Existe la "+b+" "+c+ " veces ");
    }
}