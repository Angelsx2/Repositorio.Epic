import java.util.*;
import java.util.Random;
public class Notas_Vecty
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Notas [] = new int [3];
         int prom;
         prom =0;
         for (int i=0;i<3;i++)
         {
             System.out.println("Nota (1-100) :"+ i);
         Notas[i] = entrada.nextInt();
         prom = prom+=Notas[i];
        }
        prom = prom/3;
        System.out.println("Promedio de Notas"+prom);
        if ((prom/3) >=89)
        System.out.println("Felicitaciones capo : Pasaste");
        if ((prom>=61) && (prom<=79))
        System.out.println("Felicitaciones : apenas si");
        if (prom<=60)
        System.out.println("Anda a rogar : otro año");
        }
    }