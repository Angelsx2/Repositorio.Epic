import java.util.*;
public class clase
{
    public static String Data [] = new String [10];
    public static int Edad;
    public static void Puerta(String Nombre, char Genero, int Edad)
    {
        String M;
        String H;
        System.out.println(M = Nombre.replace( 'M', 'a'));
        H = Nombre.replace( 'F', 'F');
        boolean Puerta = false;
        if ((Nombre==M) && (Genero == 'F') && (Edad>=18))
        Puerta = true;
        else 
        Puerta = false;
        if (Puerta)
        System.out.println("Abierto");
        else 
        System.out.println("Cerrado");
    }
    public static void main (String []args)
    {
        Scanner e = new Scanner (System.in);
        System.out.print("NOMBRE DE INGRESO : ");
        Data [0] = e.next();
        System.out.print("GENERO : ");
        char Genero = 18; 
        System.out.print("EDAD :  ");
        Edad = e.nextInt();
        Puerta(Data [0],Genero,Edad);
    }
}
