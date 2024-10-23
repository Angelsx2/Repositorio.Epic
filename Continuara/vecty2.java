import java.util.*;
public class vecty2
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Varia [] = new int [50];
         int n,s,t,su;
         s = 0;
         t = 0;
         System.out.print("Vector :");
         n = entrada.nextInt();
         System.out.println("---------------Datos del vector------------");
         for (int i=0 ; i<n ; i++)
         { System.out.print("Ingre datos, en posicion[" + i + "]:");
           Varia[i]= entrada.nextInt();
            }
         System.out.println("------------Datos cargados-------------------");
         System.out.println("Vector posiciones  :");
         for (int i=0 ; i<n ; i++)
         {
             
             System.out.println("[" + i + " ] :" + Varia [i] +"  ;  ");
             
        }
        System.out.println("Suma Vector especifico ");
        while (s<5)
        {System.out.println("Posicion Vector    :");
        t = Varia[entrada.nextInt()];
         System.out.println("Posicion Vector 2 :");
        su =Varia[entrada.nextInt()];
         System.out.println("suma:"+(t+su));
         System.out.println("Salir?,pres 5,continue press 0 ");
         s = s+(entrada.nextInt());
        }
        
        }
    }