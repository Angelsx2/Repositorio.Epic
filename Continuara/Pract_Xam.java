import java.util.*;
public class Pract_Xam
{
    public static void main (String []args)
    {  
        Scanner e = new Scanner (System.in);
        int m [] [] = new int [11] [11];
        int m2 [] [] = new int [11] [11];
        int v[] = new int [50];
        int a,s,n,f,c,u;
        s = 0;
        f = 0;
        n = 0;
        a = 0;
        c = 0;
        while (a!=5)
        {
            
            System.out.println("  ");
        System.out.println("♦ Vector  : 1");
        System.out.println("☻ Matriz : 2");
        System.out.println("♦ Salir = 5");
        a = e.nextInt();
        System.out.println("  ");
        switch (a)
        {
            case 1:
            while (a!=6)
            {
                 System.out.println(" ");
                System.out.println("Sumar posiciones pares = 1 ");
                System.out.println("Sumar posiciones impares = 2 ");
                 System.out.println("Volver = 6");
                System.out.println(" ");
                a = e.nextInt();
                switch (a)
                {
                case 1:
        System.out.println("---------------Numeros Vector------------");
        System.out.println("Vector par ");
        n = new Random().nextInt(40);
        System.out.println("Vector Tamaño "+ n);
        System.out.println(" ");
        System.out.println("Vector ");
        s = 0;
         for (int i=1 ; i<=n ; i++)
         { 
           v[i]= new Random().nextInt(10);
           System.out.println("[" + i + " ] :" + v [i]);
           if (i%2==0)
           s =s+v [i] ;
            }
            System.out.println("Suma posiciones pares : " +s);
            break;
            case 2:
          System.out.println("---------------Numeros Vector------------");
          System.out.println("Vector impar ");
        n = new Random().nextInt(25);
        System.out.println("Vector Tamaño "+ n);
        System.out.println(" ");
         s = 0;
         for (int i=0 ; i<n ; i++)
         { 
           v[i]= new Random().nextInt(10);
           System.out.println("[" + i + " ] :" + v [i]);
           if (i%2>0)
           s =s+v [i] ;
            } 
            System.out.println("Suma posiciones impares : " +s);
            System.out.println(" ");
            break;
        }
        }
           break;
        case 2:
        while (a!=6)
        {
            System.out.println("Matriz normal  = 1");
            System.out.println("Matriz inversa = 2");
            System.out.println("Matriz hacia abajo = 3");
            System.out.println("Matriz en dos sentidos = 4");
            System.out.println("Volver = 6");
            a = e.nextInt();
            switch(a)
            {
                case 1:
                System.out.println("Matriz normal ");
        n = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+n);
         for ( f=0 ; f<n ;f++)
         {
             for (c=0 ; c<n ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
            for ( f=0 ; f<n ;f++)
         {
             for (c=0 ; c<n ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            break;
                case 2:
                System.out.println("Matriz inversa");
        n = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+n);
         for ( f=n ; f>0 ;f--)
         {
             for (c=n ; c>0 ; c--)
             {
                 m [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
            for ( f=1 ; f<=n ;f++)
         {
             for (c=1 ; c<=n ;c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
           System.out.println("   ");
           break;
           case 3:
                System.out.println("Matriz Hacia abajo ");
        n = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+n);    
             for (c=0 ; c<n ; c++)
         {
             for ( f=0 ; f<n ;f++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
               }
            }
             System.out.println("Orden Matriz");
             System.out.println("  ");
            
            for ( f=0 ; f<n ;f++)
         {
             for (c=0 ; c<n ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
            break;
            case 4:
                System.out.println("Matriz en dos sentidos ");
        n = new Random().nextInt(5);
        System.out.println("Filas y columnas Matriz "+n);  
        
             for (c=0 ; c<n ; c++)
         {
             for ( f=0 ; f<n ;f++)
             {
                 m [f] [c] =new Random().nextInt(20);
                 m2 [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
                 if (c%2>0)
                 {
                     for (c=c ; c<n-c-1 ; c++)
          {
                   for ( f=n-1 ; f>0 ;f--)
             {
                 m [f] [c] =new Random().nextInt(20);
                 System.out.println("Matriz ["+f+"] ["+c+"] : "+m [f] [c]);
                    }
                }
                    }
                    }
                }
             System.out.println("Orden Matriz");
             System.out.println("  ");
            for ( f=0 ; f<n ;f++)
         {
             for (c=0 ; c<n ; c++)
             {System.out.print(m [f] [c] + " ");
               }
               System.out.println();
            }
           case 6:
           System.out.println("  ");
           break;
           default :
             System.out.println("Elija otra ");
                break;
        }
        }
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