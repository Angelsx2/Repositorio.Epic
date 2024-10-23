import java.util.*;
public class Funcion_3
{
    static final double g = 9.18 ; //Declarando constante global
    static final double pi = 3.1415 ;
     static int a; //Declarando una variable global
    public static void  a(int n [])
    {
       final int s = 3;
       final int c = 5;
       System.out.println(s*n[1]+n[2]+c*n[3]+pi);
    }
    public static void main (String []args) 
    {
        Scanner e = new Scanner (System.in);
        int n [] = new int [25]; // Variable local
        System.out.println("Sumas ");
        System.out.println("Salir = -1 ");
        a = 0;
        n [a] = 1;
        do 
        {
            a = a+1;
            System.out.println("Numero "+ a +" : ");
            n [a] = e.nextInt();
        }
        while (n [a]!=0);
        /*for (a=1 ; a<4 ; a++)
        {
            System.out.println("Numero "+ a +" : ");
            n [a] = e.nextInt();
        }*/
        a(n);
    }
}