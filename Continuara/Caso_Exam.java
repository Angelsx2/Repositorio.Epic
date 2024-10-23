import java.util.*;
public class Caso_Exam
{
    public static void main (String []args)
    {  
        Scanner e = new Scanner (System.in);
        int  v [] = new int [11];
        int v2 [] = new int [11];
        int m [] [] = new int [11] [11];
        int a,b,n,f,c,u;
        b = 0;
        f = 0;
        n = 0;
        a = 0;
        while (a!=5)
        {
            System.out.println("  ");
        System.out.println("♦ Si quiere operar ponga 1");
        System.out.println("♠ Si no, pa vector ponga 2");
        System.out.println("☻ y si se quiere complicar ponga 3"+"      "+"(psdt:Matriz)");
        System.out.println("○ y si no salga con "+" 5 " +" ");
        System.out.println("       y cierre esta ventana ☺");
        a = e.nextInt();
        System.out.println("  ");
        switch (a)
        { 
          case 1:
          while (a!=6)
          {
              System.out.println(".---------------------------------------:");
              System.out.println("Continuar = 1");
              System.out.println("Volver = 6");
              a = e.nextInt();
            System.out.println(".--------------------------------------:");
            switch (a)
              {
                  case 1:
        System.out.println("NUMERO A FACTORIZAR");
        n = e.nextInt();
        System.out.println("Factores");
        System.out.println("1.2.3....."+n);
        b = 1;
        f = n;
        while (f>0)
        {
          b*=f--;
          if (f==0)
          System.out.print("Factorial" +":"+b);
        }
        System.out.println("   ");
     }
    }
        break;
        case 2:
        while (a!=6)
        {
            System.out.println(".---------------------------------------:");
            System.out.println("Continuar = 1");
              System.out.println("Volver = 6");
              a = e.nextInt();
              System.out.println(".---------------------------------------:");
              switch (a)
              {
                  case 1:
        System.out.println("---------------Numeros Vector------------");
        n = new Random().nextInt(10);
        System.out.println("Vector Tamaño "+n);
        System.out.println("Vector v1 ");
         for (int i=0 ; i<n ; i++)
         { 
           v[i]= new Random().nextInt(10); 
           if (v [i]%2==0) 
           b+=v[i];
           System.out.println("[" + i + " ] :" + v [i] +"  ;  ");
            }
            System.out.println("v1 : "+b);
            System.out.println("Vector v2 ");
            for (int i=0 ; i<n ;i++)
            {v2[i]= new Random().nextInt(10);
           if (v2 [i]%2==0) 
           f+=v2[i];
           System.out.println("[" + i + " ] :" + v2 [i] +"  ;  ");
        }
           System.out.println("v2 : "+f);
        System.out.println("Suma de pares v1 + v2: "+(b+f));
        System.out.println("  ");
     }
    }
        break ;
        case 3:
        while (a!=6)
        {
            System.out.println(".---------------------------------------:");
            System.out.println("Continuar = numero");
              System.out.println("Volver = 6");
              a = e.nextInt();
              System.out.println(".---------------------------------------:");
              switch (a)
              {
                  case 1:
        int s=0;
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
         for ( f=0 ; f<b ;f++)
         {
             for (c=0 ; c<b ; c++)
             {
                 if (f==c)
                 s =s+m[f][c];
                 
              }
          }
            System.out.println("Suma Diagonal principal : "+s);
            System.out.println("   ");
         }
        }
            break;
        }
    }
               System.out.println("entendible tenga un buen dia");  
    }
}