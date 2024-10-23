import java.util.*;
public class Dividir
{
    public static void main (String []args)
    {  
        Scanner e = new Scanner (System.in);
        int n,m,r;
        r = 0;
        while (r==0)
        {
        System.out.println("Numero : ");
        m = e.nextInt();
        for (n=1 ; n<3 ; n++)
        System.out.println(n + " "+(m/n));
      }
    }
}