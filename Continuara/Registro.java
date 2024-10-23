import java.util.*;
public class Registro
{
    static  String d [] = new String [50];
    static  String d2 [] = new String [50];
    static  int n [] = new int [8];
    static  int n2 [] = new int [8];
    static  int a = 1,b=3,c=0;
     public static void ap()
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
            if (a==1){
            for (c=0 ; c<b ; c++){
                d2 [c] = d [c];
            }
            }
            b = b+3;
            switch (a)
            {
                case 0:
                break;
                case 1:
                System.out.print("Nombre please : ");
                d [0] = e.next();
                System.out.print("Apellido paterno please : ");
                d [1] = e.next();
                System.out.print("Apellido materno please : ");
                d [2] = e.next();
                System.out.print("Horas de trabajo : ");
                n [0] = e.nextInt();
                n[0]*=13;
                System.out.print("Horas de trabajo (Extra) : ");
                n [1] = e.nextInt();
                n[1]*=26;
                System.out.print("¿Antiguedad? : ");
                n [2] = e.nextInt();
                System.out.println("\t \t \t \t pago 13bs/h. \n \t \t \t \t h. Extras 26/h.");
                if ((n[2]>=0) && (n[2]<=3))
                a = 200;
                if ((n[2]>=3) && (n[2]<=5))
                a = 500;
                if ((n[2]>=5) && (n[2]<=10))
                a = 800;
                if (n[2]>=10)
                a = 1000;
                System.out.print("Total a saldar : "+(n[3]=n[0]+n[1]+a));
                System.out.println(" ");
                break;
                case 2:
                    System.out.println("Ingrese nombre a buscar ");
                    b1 = e.next();
                    for (int c=0 ; c<d2.length ; c++){
                        if (b1.equals(d2 [c])){
                          System.out.println("Encontrado es : "+d2 [c]);
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
        ap();
    }
}