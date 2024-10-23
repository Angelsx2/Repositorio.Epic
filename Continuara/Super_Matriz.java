import java.util.*;
public class Super_Matriz
{
    public static void main (String []args)
    {  
        Scanner e = new Scanner (System.in);
        int m [] [] = new int [11] [11];
        int v[] = new int [50];
        int v2[] = new int [50];
        int a,b,n,f,c,u;
        b = 0;
        f = 0;
        n = 0;
        a = 0;
        while (a!=5)
        {
            
            System.out.println("  ");
        System.out.println("♦ Si quiere a su primo  : 1");
        System.out.println("♠ Pa vector invertido   : 2");
        System.out.println("☻ y diagonal secundaria : 3"+"      "+"(psdt:Matriz)");
        System.out.println("♦ Salir = 5");
        a = e.nextInt();
        System.out.println("  ");
        switch (a)
        {
            case 1:
        System.out.println("---------------Numeros Vector------------");
        n = new Random().nextInt(40);
        System.out.println("Vector Tamaño "+ n);
        System.out.println(" ");
        System.out.println("Vector ");
         for (int i=0 ; i<n ; i++)
         { 
           v[i]= new Random().nextInt(10);
           System.out.println("[" + i + " ] :" + v [i]);
            }
            System.out.println("Numeros primos del Vector : ");
            for (int i=0 ; i<n ; i++)
            {
                boolean prime = true;
                for (b=2 ; b<v [i] ; b++)
                {
                  if (v [i]%b==0)
                  {  prime = false;
                   }
                }
                if (prime)
                System.out.println("["+i+"] : "+v[i]);
            }
            break;
             case 2:
        System.out.println("---------------Vector inverso------------");
        System.out.println("Vector Tamaño ");
        n = e.nextInt();
        System.out.println("Vector ");
         for (int i=0 ; i<n ; i++)
         { 
           v[i]= new Random().nextInt(20);
           System.out.println("[" + i + " ] :" + v [i]);
            }
            System.out.println("Inverso : ");
            for (int i=n-1 ; i>=0 ; i--)
         { 
           System.out.println("["+i+"] : "+ v[i]);
            }
            break;
        case 3:
        b = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+b);
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
            for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            System.out.println("Secundaria : ");
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {
                 
                 if (f+c==(b-1))
                 System.out.println(m [f] [c]);
                 
              }
          }
            System.out.println("   ");
            break;
            case 5:
            System.out.println("  ");
            break;
            default :
                System.out.println("Esta opcion sera actualizada, muy pronto (o noo");
                break;
        }
    }
               System.out.println("entendible tenga un buen dia");
        
    }
}