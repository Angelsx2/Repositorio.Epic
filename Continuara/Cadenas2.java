import java.util.*;
public class Cadenas2
{
    static  String d [] = new String [11];
    static  int n [] = new int [8];
    static  String nom = "";
    static  String ap = "" ;
    public static void  no()
    {Scanner e = new Scanner (System.in);
        System.out.print("Nombre (s) : ");
         nom = e.next();
    }
     public static void ap()
    {Scanner e = new Scanner (System.in);
        System.out.print("Apellido (s) : ");
        ap  = e.next();
    }
    public static void form()
    {
        Scanner e = new Scanner (System.in);
        int a=0;
        no();
        ap();
        do{
        System.out.println("\t  \t 1 : M = Masculino \n \t \t 2 : F = Femenino  ");
        System.out.print("Genero (s) : ");
        a = e.nextInt();
        switch (a){
        case 1:
        d [2] = "M";
        System.out.print("Genero (s) : "+d [2]);
        break;
        case 2:
        d [2] = "F";
        System.out.print("Genero (s) : "+d [2]);
        break;
        default:
        System.out.println("Solo son dos");
     }
    }
    while ((a!=1) && (a!=2));
    System.out.println(" ");
        System.out.print("Edad : ");
        n [0]  = e.nextInt();
        System.out.print("Materia : ");
        d [3] = e.next();
        for (int i=1 ; i<4 ; i++){
        System.out.println("Nota "+ i +" : ");
        n [i]  = e.nextInt();
        n [4]+=n[i];
        }
        System.out.println("Nota Final : "+(n[4]/3));
    }
    public static void main (String []args)
    {
        form();
        System.out.println(" \n");
        System.out.println(" \n");
        System.out.println(" \n");
        System.out.println("Nombre (s) : "+nom);
        System.out.println("Apellido (s) : "+ap);
        System.out.println("Genero (s) : "+d [2]);
        System.out.println("Edad : "+n [0] );
        System.out.println("Materia : "+d [3]);
        for (int i=1 ; i<4 ; i++){
        System.out.println("Nota "+ i +" : "+n [i]);
    }
    System.out.println("Nota Final : "+(n[4]/3));
    if (n[4]/3<61)
        System.out.println("Felicidades reprovaste");
        if (n[4]/3>61)
        System.out.println("Felicidades aprovaste");
}
}