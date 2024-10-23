import java.util.*;
public class Examen 
    {
        public static void main (String[]args)
       { Scanner entrada = new Scanner (System.in);
        int n,s;
        int v3 [] = new int [11] ;
        System.out.println("Menu");
        System.out.println("1.Operacion");
        System.out.println("2.Vector");
        System.out.println("3.Matriz");
        System.out.println(" ");
        System.out.println("Elija una opcion");
        n = entrada.nextInt();
        switch (n)
        {
          case 1:
          System.out.println("1.OPERACION");
          
          int conta,facto,N, temp;
          System.out.println("NUMERO A FACTORIZAR");
          N = entrada.nextInt();
          
          conta =1;
          temp = N;
          while (temp>0)
          {
          conta*=temp--;          
          if (temp==0)
          System.out.print("El factorial es" +":"+conta);          
          }                    
          break;
          
          case 2:
          System.out.println("2.VECTOR");
          int v1 [] = new int [10];
          int v2 [] = new int [10];
         
          int a;
          System.out.println("Suma de Vectores");
          a = new Random().nextInt(10);
          System.out.println("Vector uno");
          for (int i=0 ; i<a ; i++)
          {
              v1[i] = new Random().nextInt(100);
              v2[i] = new Random().nextInt(100);
              System.out.println("Vector"+"["+i+"] :"+ v1[i]);
          }
          System.out.println("Vector dos");
          for (int i=0 ; i<a ; i++)
          {
              System.out.println("Vector "+"["+i+"] :"+ v2[i]);
              v3 [i] = v1[i] +v2[i];
          } System.out.println("Suma : ");
          for (int i=0 ; i<a ; i++)
          {
              v3 [i] = v1[i] +v2[i];
              System.out.println("Vector "+"["+i+"] :"+ v3[i]);
              
          }  
          break;
          
          case 3:
          System.out.println("3.MATRIZ");
          int m1 [] [] = new int [50] [50];
         int b,f,c;
         System.out.println("Filas de Matriz");
         s = entrada.nextInt();
         System.out.println("Columnas Matriz");
         b = entrada.nextInt();
         for ( f=0 ; f<s ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print("Matriz:");
                 m1[f] [c] = new Random().nextInt(100);
               }
            }
          
            System.out.println("Orden Matriz");
            for ( f=0 ; f<s ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print(m1 [f] [c] + " ");
               }
               System.out.println();
            }                  
          break;
        
          default:
          System.out.println("La opcion ingresada no es valida");
        }
        
        
    }
}