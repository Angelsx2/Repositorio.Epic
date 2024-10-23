import java.util.*;
public class vecty5
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Varia [] = new int [1000000];
         int n,s,t,su;
         s = 0;
         t = 0;
         System.out.print("Tamaño Vector :");
         n = new Random ().nextInt(1000);
         System.out.println("---------------Datos del vector------------");
         while (s<n)
         { System.out.print("Ingre datos, en posicion[" + s + "]:");
           Varia[s]= new Random().nextInt(10000);
           s = s+1;
          }
         System.out.println("------------Datos cargados-------------------");
         System.out.println("Vector posiciones  :");
         s = 0;
         while (s<n)
         {
             
             System.out.println("[" + s + " ] :" + Varia [s] +"  ;  ");
             s =s+1;
             
        }
        }
        
}
