import java.util.*;
import java.util.Random;
public class Vecty_Suma
{
    public static void main (String []args)
    { 
        Scanner entrada = new Scanner (System.in);
         int v1 [] = new int [100];
         int v2 [] = new int [100];
         int v3 [] = new int [100];
         int v4 [] = new int [100];
         int a;
         System.out.println("Vectores Random");
         a = new Random().nextInt(25);
         System.out.println("   Vector uno");
         for (int i=0;i<a;i++)
         {
             v1[i] = new Random().nextInt(100);
             System.out.println("Vector"+"["+i+"] :"+ v1[i]);
        }
        System.out.println("    Vector dos");
        for (int i=0;i<a;i++)
        {
            v2[i] = new Random().nextInt(100);
         System.out.println("Vector "+"["+i+"] :"+v2[i]);
        }
        System.out.println("    Vector tres");
         for (int i=0;i<a;i++)
         {
             v3[i] = new Random().nextInt(100);
             System.out.println("Vector"+"["+i+"] :"+v3[i]);
         
        }
        System.out.println("    Vector cuatro");
         for (int i=0;i<a;i++)
         {
             v4[i] = new Random().nextInt(100);
             System.out.println("Vector"+"["+i+"] : "+v4[i]);
        }
        for (int i=0;i<a;i++)
        System.out.println("v1 ["+i+"] " +"+" + " v2 ["+i+"] : "+ " v3 ["+i+"]"+ " v4 ["+i+"]"+ (v1 [i]+v2 [i]+v3[i]+v4[i]));
    }
}