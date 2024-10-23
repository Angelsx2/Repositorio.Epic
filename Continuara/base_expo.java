import java.util.*;
public class base_expo
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
        int num,expo,R,num2;
        System.out.print("Ponga numero "+" :");
        num = entrada.nextInt();
        System.out.print("Exponente"+" :");
        expo = entrada.nextInt();
        R = 2;
        num2 = num;
        while (R<=expo)
        {
            System.out.println(num*=num2);
            R = R+1;
        }
    }
}