import java.util.*;
public class Fig_Exam
{
    static String m [] [] = new String [21] [21];
    static int n [] = new int [50];
    static int n2 [] = new int [50];
    static String d [] = new String [50];
    static String d2 [] = new String [50];
    static int a,b,c,codi;
    public static void f1()
    {
        Scanner e = new Scanner (System.in);
        System.out.println("Tamaño de la figura : ");
        a = e.nextInt();
        b = 1;
        while (b<=a)
        {
            System.out.print("* ");
            if (b==a){
                System.out.println();
                 for (int i=0 ; i<a-1 ; i++)
             System.out.println("*");
        }
        b = b+1;
    }
    }
    public static void f2()
    {
        Scanner e = new Scanner (System.in);
        int i=0,t;
         m [i] [c] = " ";
        System.out.println("Tamaño de la segunda figura : ");
        a = e.nextInt();
        for (i=0 ; i<a ; i++){
            for (c = 0;c<a ; c++){
                m [i] [c] =" ";
            }
    }
        for (t=a ;t>0 ; t--){
        for (i=0 ; i<t ; i++){
            for (c = 0;c<t ; c++){
                if (i+c==t-1){
                    m [i] [c] = "*";
                }
            }
    }
}
    for (i=0 ; i<a ; i++){
            for (c = 0;c<a ; c++){
                System.out.print(m [i] [c]);
            }
            System.out.println();
    }
}
    public static void Plani()
    {
        Scanner e = new Scanner (System.in);
        int i=0,o=0;
        String b1 ;
        while (a!=0)
        {
            System.out.println();
            System.out.println("---------------CORP. UNDERsKY--------------------------");
            System.out.println("\t \t \t \t 1 :Agregar empleado \n \t \t \t \t 0 :Salir");
            System.out.println("\t \t \t \t 2 :Ver datos posteriores");
            a = e.nextInt();
            switch (a)
            {
                case 0:
                break;
                case 1:
                    n [0] = new Random().nextInt(1000);
                    System.out.println("Codigo de identificacion : "+ n [0]);
                System.out.print("Nombre please : ");
                d [0] = e.next();
                System.out.print("Apellido paterno : ");
                d [1] = e.next();
                System.out.print("Apellido materno : ");
                d [2] = e.next();
                d [3] = " ";
                System.out.print("Horas de trabajo : ");
                n [1] = e.nextInt();
                n[1]*=20;
                System.out.print("Horas de trabajo (Extra) : ");
                n [2] = e.nextInt();
                n[2]*=40;
                System.out.println("\t \t \t \t pago 13bs/h. \n \t \t \t \t h. Extras 26/h.");
                System.out.println(" \t \t \t \t Descuentos : \n \t \t \t \t \t IVA 5 % ");
                System.out.print("Total a saldar : "+(n[3]=n[0]+n[1]*(5)));
                System.out.println(" ");
                b = 4;
            for (c=0 ; c<b ; c++){
                d2 [c] = d [c];
                n2 [c] = n [c];
            }
            b = b+4;
                break;
                case 2:
                    /*System.out.println("Ingrese nombre a buscar ");
                    b1 = e.next();
                    for (int c=0 ; c<d2.length ; c++){
                        if (b1.equals(d2 [c])){
                          System.out.println("Encontrado es : "+d2 [c]);
                        }
                        }*/
                        System.out.println("Codigo de identificacion");
                        o = e.nextInt();
                        for (i=0 ; i<n.length ; i++){
                            if (n [i]==o){
                                for (i=i ; i<4 ; i++){
                                    System.out.println(d2 [i]);
                                }
                                for (i=i-i; i<4 ; i++){
                                    System.out.println(n2 [i]);
                                }
                            }
                        }
                        break;
                default:
                System.out.println("Opcion no disponible");
                break;
            }
        }
    }
    public static void main (String []args)
    {
        Scanner e = new Scanner (System.in);
        a = 1;
        while (a!=0){
     System.out.println("¿Como continuamos? ");
     System.out.println("\t \t \t \t 1 : Figura 1 \n \t \t \t \t 2 :Segunda figura");
     System.out.println("\t \t \t \t 3: Planilla de sueldo");
     System.out.println("\t \t \t \t 0: Salir");
     a = e.nextInt();
     switch (a)
     {
         case 0:
            break;
         case 1:
          f1();
          break;
          case 2:
              f2();
              break;
         case 3: 
           Plani();
           break;
           default :
               System.out.println("Esta opcion no existe ");
     }
    }
}
}