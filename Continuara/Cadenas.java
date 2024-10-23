import java.util.*;
public class Cadenas
{
    public static void main (String []args)
    {
        Scanner e = new Scanner (System.in);
        int n;
        System.out.println("Dame un numero :");
        n = e.nextInt();
        
        System.out.println("Dame un caracter : ");
        char c = e.next().charAt(0);
        
        System.out.println("Dame un apellido :");
        String cadena = e.next();
        
        System.out.println("Lo ingresado es  : "+ n);
        System.out.println("Lo ingresado es  : "+ c);
        System.out.println("Lo ingresado es  : "+ cadena);
    }
}