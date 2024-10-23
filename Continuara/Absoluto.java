import java.util.*;
public class Absoluto
{
    public static void main (String []args)
    {
        Scanner entrada = new Scanner (System.in);
        int b,c;
        System.out.print("Ingresar  Numero  :");
        c = entrada.nextInt();
        /*b = 0;
        if (c<b)
        {c = c*-1;
        System.out.print("Absoluto :  "+c); }
        else
        System.out.print("Absoluto :  "+c);*/
        c = Math.abs(c);
        System.out.print("Absoluto :  "+c);
    }
}