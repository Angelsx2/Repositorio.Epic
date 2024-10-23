import java.util.*;
public class ABC
{
    public static void main (String []args)
    { Scanner e = new Scanner (System.in);
        char a= 'a';
        char v [] = new char [30];
        int b;
        for (int i=0 ; i<29 ; i++)
        {
            v [i] = a;
            b=v[i];
            a++;
            System.out.print(b + " ,");
        }
        System.out.println();
    }
}