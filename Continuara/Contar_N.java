import java.util.*;
public class Contar_N
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
        int num,cont,a;
        for (cont=1;cont<5;cont=+0)
    {
        System.out.println("Numero please"+"  :");
        num = entrada.nextInt();
        {
        if ((num>=-9) && (num<=9))
        System.out.println("El numero "+ num +" es un digito");
        if ((num>=10) && (num<=99))
        System.out.println("El numero "+num+" son dos digitos");
        if ((num>=100) && (num<=999))
        System.out.println("El numero "+num+" son tres digitos");
        if ((num>=1000) && (num<=9999))
        System.out.println("El numero "+num+" Son cuatro digitos");
        if ((num>=10000) && (num<=99999))
        System.out.println("El numero "+num+" Son cinco digitos");
        if ((num>=100000) && (num<=999999))
        System.out.println("El numero "+num+" son seis digitos");
        if (num==1000000)
        System.out.println("son siete digitos");
        if ((num<=-10) && (num>=-99))
        System.out.println("El numero "+num+" son dos digitos");
        if ((num<=-100) && (num>=-999))
        System.out.println("El numero "+num+" son tres digitos");
        if ((num<=-1000) && (num>=-9999))
        System.out.println("El numero "+num+" Son cuatro digitos");
        if ((num<=-10000) && (num>=-99999))
        System.out.println("El numero "+num+" Son cinco digitos");
        if ((num<=-100000) && (num>=-999999))
        System.out.println("El numero "+num+" son seis digitos");
        if (num==-1000000)
        System.out.println("son siete digitos");
        if (num>1000000)
        System.out.println("Dale otro numero");
        if (num<-1000000)
        System.out.println("Dale otro numero");
        }
        }
    }
}