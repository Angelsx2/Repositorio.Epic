import java.util.Scanner;
public class Dif
    {
        public static void main (String[]args)
       { Scanner entrada = new Scanner (System.in);
        int u,d,t,posi,nega;
        System.out.println(".----------------:");
        System.out.println("Diferenciando Nùmeros ");
        u  = 0;
        t = 1;
        posi = 0;
        nega = 0;
        while (u<10)
        {
           System.out.println("Numero  "+ t +":");
        d = entrada.nextInt(); 
        if (d>0){posi = posi+1;}
        else  {nega = nega+1;}
        System.out.println("positivos :"+ posi);
        System.out.println("negativos :"+nega);
        d = d++;
        u = u+1;
        t = t+1;
        }
    }
}