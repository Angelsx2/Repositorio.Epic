import java.util.*;
public class vecty
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Varia [] = new int [50];
         int n,s,t,p,im=0;
         s = 0;
         t = 0;
         p = 0;
         System.out.print("Vector :");
         n = entrada.nextInt();
         System.out.println("---------------Datos del vector------------");
         for (int i=0 ; i<n ; i++)
         { System.out.print("Ingre datos, en posicion[" + i + "]:");
           Varia[i]= entrada.nextInt();
           if (Varia [i]<=0) 
           s+=Varia[i];
           if (Varia [i]>=0)
           t+=Varia[i];
           if (Varia [i]%2==0)
           p+=Varia[i];
           else 
           im+=Varia[i];
            }
        System.out.println("Suma negativos  : "+ s);
        System.out.println("Suma positivos  : "+ t);
        System.out.println("Suma pares      : "+ p);
        System.out.println("Suma impares    : "+im);
         System.out.println("------------Datos cargados-------------------");
         System.out.println("Vector posiciones  :");
         for (int i=0 ; i<n ; i++)
         {
             
             System.out.println("[" + i + " ] :" + Varia [i] +"  ;  ");
             
        }
         
        }
    }