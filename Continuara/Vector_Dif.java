import java.util.*;
public class Vector_Dif
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int Varia [] = new int [50];
         int num [] =new int[50];
         int n;
         num [0] =0;
         num [1] =0;
         num [2] =0;
         num [3] =0;
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
        for (int i=0 ; i<n ;i++)
        {
        if (Varia[i]%2==0)
        num [0] =num[0]+1;
        if (Varia[i]%2>0)
        num [1] =num[1]+1;
        if ((Varia[i]%2==0) && (Varia[i]<0))
        num [1] = num[1]+1;
        if (Varia[i]>=0)
        num [2] =num[2]+1;
        if (Varia[i]<0)
        num [3] =num[3]+1;
        }
        System.out.println("Numeros Pares en vector  :"+ num[0]);
        System.out.println("Numeros impares en vector  :"+ num[1]);
        System.out.println("Numeros positivos en vector  :"+ num[2]);
        System.out.println("Numeros negativos en vector  :"+ num[3]);
    }
}