import java.util.*;
public class Funcion2
{
    // Funcion parametro recibido
    public static void mostrar(int numero)
    {
        System.out.println("you thinking in the : "+ numero);
    }
    // Funcion de suma
    public static int suma(int n1,int n2)
    {
        n1+=n2;
        return n1; // regresa un resultado
    }
    public static int po_ne(int n1)
    {
        if (n1>0)
        System.out.println("El "+n1+" es positivo");
        if (n1<0)
        System.out.println("El "+n1+" es negativo");
        return n1; // regresa un resultado
    }
     public static void pa_im(int n1,int v[])
    {
        Scanner e = new Scanner (System.in);
        while (n1!=0)
        {
        if (n1%2==0)
        System.out.println("El "+n1+" es par");
        if (n1%2>0)
        System.out.println("El "+n1+" es impar");
        System.out.println("salir : 0");
        System.out.println("Ponga numero : ");
        n1 = e.nextInt();
    }  
    }
    public static void pa_imv(int v [],int n1)
    {
        Scanner e = new Scanner (System.in);
        while (n1!=0)
        {System.out.println(" ¿Sumar pares? press 1");
        System.out.println(" ¿Sumar impares? press 2");
        System.out.println(" ¿Sumar locate pares? press 3");
        System.out.println(" ¿Sumar locate impares? press 4");
        System.out.println("salir : 0");
        n1 = e.nextInt();
            switch(n1)
            {
                case 1:
                n1 = 0;
                for (int i=0; i<v.length ; i++)
                {
        if (v[i]%2==0)
        n1+=v[i];
    }
    System.out.println("Sumado : "+n1);
        break;
        case 2:
        n1 = 0;
        for (int i=0; i<v.length ; i++)
        {
        if (v[i]%2>0)
        n1+=v[i];
    }
    System.out.println("Sumado Impar : "+n1);
        break;
        case 3:
        n1 = 0;
                for (int i=0; i<v.length ; i++)
                {
        if (i%2==0)
        n1+=v[i];
    }
    System.out.println("Sumado Posicion: "+n1);
    break;
    case 4:
    n1 = 0;
                for (int i=0; i<v.length ; i++)
                {
        if (i%2>0)
        n1+=v[i];
    }
    System.out.println("Sumado Posicion impar: "+n1);
    break;
    }
    }
    
  }
  public static void opem(int m [] [],int n1)
    {
        Scanner e = new Scanner (System.in);
        while (n1!=0)
        {System.out.println("Valor Maximo y minimo press :   1");
            System.out.println("Diagonal principal :   2");
        System.out.println("salir : 0");
        n1 = e.nextInt();
            switch(n1)
            {
                case 1:
                n1 = 0;
                for (int f=0; f<m.length ; f++)
                {
                    for (int c=0 ; c<m.length ;c++)
                    {if (m [f] [c]>=n1)
                        n1 = m[f] [c];
                    }
                }
    System.out.println("Mayor numero : "+n1);
    for (int f=0; f<m.length ; f++)
                {
                    for (int c=0 ; c<m.length ;c++)
                    {if (m [f] [c]<=n1)
                        n1 = m[f] [c];
                    }
                }
                System.out.println("Menor numero : "+n1);
        break;
        case 2:
        n1 = 0;
        for (int f=0; f<m.length ; f++)
        {
            for (int c=0 ; c<m.length ;c++)
                    {if (f==c)
                        n1 += m[f] [c];
                    }        
                }
    System.out.println("Diagonal principal : "+n1);
        break;
    }
    } 
}
    
    public static void fact(int n1)
    {
       int cont,n;
        Scanner e = new Scanner (System.in);
        while (n1!=0)
        {
            cont = 1;
            while (n1>0)
        {
          cont*=n1--;
          if (n1==0)
          System.out.println("Factorial" +":"+cont);
        }
        System.out.println("Salir= 0");
          System.out.println("Ponga numero");
          n1 = e.nextInt();
    }
    }
    public static int not(int n1,int n2,int n3)
    {
       int cont,n;
       n=0;
        Scanner e = new Scanner (System.in);
        while (n1!=0)
        {  
          n1 = (n1+n2+n3)/3;
        System.out.println("Promedio es "+ n1+"\n");
        if (n1>=61)
        System.out.println("Feclicitaciones,aprovaste");
        if (n1<61)
        System.out.println("Feclicitaciones,reprovaste");
        System.out.println("Salir= 0");
        n1 = e.nextInt();
        fact(n1);
    }
      return 1;
    }
    public static int [] v(int v[])
    {
        Scanner e = new Scanner (System.in);
        int n1=0;
        System.out.println("Welcome , this is a vector");
       for (int i=0; i<v.length ; i++)
       {v[i] = new Random().nextInt(20);
           System.out.print(v [i] +" ");
           n1+=v[i];
        }
        System.out.println("Element more :"+n1);
        System.out.println("¿Continuar a otas operaciones?");
        System.out.println("pres = 1");
        n1 = e.nextInt();
        pa_imv(v,n1);
      return v;
    }
    public static int [] []  M(int m[] [])
    {
       int n=1;
       System.out.println("loading matrix... ");
        for (int f=0 ; f<m.length ; f++)
        {
            for ( int c=0 ; c<m.length ; c++)
            {  m [f] [c] = new Random().nextInt(20);  
                System.out.println("["+f+"] ["+c+"] : "+m [f] [c]);
            }
        }
        System.out.println("Matrix Orden " );
        for (int f=0 ; f<m.length ; f++)
        {
            for ( int c=0 ; c<m.length ; c++)
            {   
                System.out.print(m [f] [c]+ " ");
            }
            System.out.println();
        }
        opem (m,n);
          return m;
    }
    public static void main (String []args)
    { 
        Scanner e = new Scanner (System.in);
        int v[] = new int [5];
        int m [] [] = new int [10] [10];
        int n,n1,a;
        System.out.println("Welcome \n");
        System.out.println("pres ' 1 ' for most a number");
       System.out.println("pres ' 2 ' the more");
       System.out.println("pres ' 3 ' the factorial");
       System.out.println("pres ' 4 ' the vect");
       System.out.println("pres ' 5 ' for a matrix");
       a = e.nextInt();
        switch (a)
        {
            case 1:
            System.out.println("typing a number :");
            n = e.nextInt();
            mostrar(n);
            break;
            case 2:
             System.out.println("typing a number :");
            n = e.nextInt();
            System.out.println("typing other a number :");
            n1 = e.nextInt();
            suma(n,n1);
            break;
            case 3:
            System.out.println("typing number");
          n1 = e.nextInt();
          fact(n1);
          break;
            case 4:
            System.out.println("change the tall the vector :");
            n = e.nextInt();
            int v1 [] = new int [n];
            v(v1);
            break;
            case 5:
            n =0;
            System.out.println("sellect the tall of Matrix :");
            n = e.nextInt();
            int m1 [] [] = new int [n] [n];
            M(m1);
    }
    }
}