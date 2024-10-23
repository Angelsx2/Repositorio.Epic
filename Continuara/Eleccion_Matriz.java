import java.util.*;
public class Eleccion_Matriz
{
    public static void main (String []args)
    { Scanner e = new Scanner (System.in);
        int f,c,n;
        int m [] [] = new int [11] [11];
        int m2 [] [] = new int [11] [11];
        int m3 [] [] = new int [11] [11];
        int m4 [] [] = new int [11] [11];
        int m5 [] [] = new int [11] [11];
        int m6 [] [] = new int [11] [11];
        int m7 [] [] = new int [11] [11];
        int v [] = new int [12];
        int v2 [] = new int [12];
        n=0;
        f = 0 ;
        c = 0 ;
        v [0] = new Random().nextInt(5);
           v [1] = new Random().nextInt(5);
         for ( f=0 ; f<v[0] ;f++)
         {
             for (c=0 ; c<v[1] ; c++)
             {
                 m [f] [c] =new Random().nextInt(20);
               }
            }
             v [2] = new Random().nextInt(5);
             v [3] = new Random().nextInt(5);
            for ( f=0 ; f<v [2] ;f++)
         {
             for (c=0 ; c<v [3] ; c++)
             {
                 m2 [f] [c] =new Random().nextInt(20);
               }
            }
            v [4] = new Random().nextInt(5);
            v [5] = new Random().nextInt(5);
            for ( f=0 ; f<v [4] ;f++)
         {
             for (c=0 ; c<v [5] ; c++)
             {
                 m3 [f] [c] =new Random().nextInt(20);
               }
            }
            v [6] = new Random().nextInt(5);
            v [7] = new Random().nextInt(5);
            for ( f=0 ; f<v [6] ;f++)
         {
             for (c=0 ; c<v [7] ; c++)
             {
                 m4 [f] [c] =new Random().nextInt(20);
               }
            }
            v [8] = new Random().nextInt(5);
             v [9] = new Random().nextInt(5);
            for ( f=0 ; f<v [8] ;f++)
         {
             for (c=0 ; c<v [9] ; c++)
             {
                 m5 [f] [c] =new Random().nextInt(20);
               }
            }
            v [10] = new Random().nextInt(5);
           v [11] = new Random().nextInt(5);
         for ( f=0 ; f<v[10] ;f++)
         {
             for (c=0 ; c<v[11] ; c++)
             {
                 m6 [f] [c] =new Random().nextInt(20);
               }
            }
        while (n!=9)
        {
            System.out.println("Opciones de matriz ");
            System.out.println();
            System.out.println("1 : Sumar Matrices");
            System.out.println("2 : Restar amtrices ");
            System.out.println("3 : Multiplicar matrices");
            System.out.println("4 : Diagonales de matriz");
            System.out.println("9 : Salir ");
            n = e.nextInt();
            switch (n)
            {
                case 1:
                    while (n!=8)
                    {
                        System.out.println("Sumar Matrices");
                        System.out.println(" ");
                        System.out.println("Seleccione matriz : ");
                        System.out.println(" ");
                        System.out.println("Matriz 1 : "+" f "+v [0]+" c "+v [1]);
                        System.out.println("Matriz 2 : "+" f "+v [2]+" c "+v [3]);
                        System.out.println("Matriz 3 : "+" f "+v [4]+" c "+v [5]);
                        System.out.println("Matriz 4 : "+" f "+v [6]+" c "+v [7]);
                        System.out.println("Matriz 5 : "+" f "+v [8]+" c "+v [9]);
                        System.out.println("Matriz 6 : "+" f "+v [10]+" c "+v [11]);
                        System.out.println("¿Mostrar Matriz? : 7");
                        System.out.println("Volver = 8");
                        n = e.nextInt();
                           switch (n)
                           {
                               case 1:
                                   
                                 while (n!=9)
                                {
                                 for (f=0 ; f<v[0] ; f++)
                                 {
                                     for (c=0 ; f<v[1] ; c++)
                                     System.out.println();
                                    }
                              }
                              System.out.println("Sumado : "+m7 [f] [c]);
                              break;
                              case 7:
                                  while (n!=9)
                                  {
                                  System.out.println("Seleccione matriz : ");
                        System.out.println(" ");
                        System.out.println("Matriz 1 : "+" f "+v [0]+" c "+v [1]);
                        System.out.println("Matriz 2 : "+" f "+v [2]+" c "+v [3]);
                        System.out.println("Matriz 3 : "+" f "+v [4]+" c "+v [5]);
                        System.out.println("Matriz 4 : "+" f "+v [4]+" c "+v [5]);
                        System.out.println("Matriz 5 : "+" f "+v [2]+" c "+v [3]);
                        System.out.println("Matriz 6 : "+" f "+v [0]+" c "+v [1]);
                        System.out.println("Volver = 9");
                        n = e.nextInt();
                        System.out.println(" ");
                        switch (n)
                        {
                        case 1:
                        {
                            for ( f=0 ; f<v [0] ;f++)
                            {
                               for (c=0 ; c<v [1] ; c++)
                             {
                               System.out.print(m [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                        case 2:
                        {
                            for ( f=0 ; f<v [2] ;f++)
                            {
                               for (c=0 ; c<v [3] ; c++)
                             {
                               System.out.print(m2 [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                        case 3:
                        {
                            for ( f=0 ; f<v [4] ;f++)
                            {
                               for (c=0 ; c<v [5] ; c++)
                             {
                               System.out.print(m3 [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                        case 4:
                        {
                            for ( f=0 ; f<v [4] ;f++)
                            {
                               for (c=0 ; c<v [5] ; c++)
                             {
                               System.out.print(m4 [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                        case 5:
                        {
                            for ( f=0 ; f<v [2] ;f++)
                            {
                               for (c=0 ; c<v [3] ; c++)
                             {
                               System.out.print(m5 [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                        case 6:
                        {
                            for ( f=0 ; f<v [0] ;f++)
                            {
                               for (c=0 ; c<v [1] ; c++)
                             {
                               System.out.print(m6 [f] [c] +" ");
                             }
                              System.out.println();
                            }
                        }
                        break;
                    }
                    }
                        }
            }
        }
    }
   }
}