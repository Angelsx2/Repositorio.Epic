import java.util.*;
public class Base_Expo2
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
        double num,expo,R,i;
        System.out.print("Ponga numero "+" :");
        num = entrada.nextDouble();
        System.out.print("Exponente"+" :");
        expo = entrada.nextDouble();
        /*R = 1;
        if (expo==0)
        R=1;
        else
        for (i=1; i<=expo; i++)
        {R=R*num;
        }
        System.out.println("Potenciado :"+R);*/
        R = Math.pow(num,expo);
        System.out.print("La potencia de "+ num +" es: "+R);
    }
}