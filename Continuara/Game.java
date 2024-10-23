import java.util.*;
public class Game
{
    static final int vacio = 0;
    static final int mina = 1;
    static final int tesoro = 2;
    static final int intento = 3;
    public static void main (String[]args)
    {
        Scanner e = new Scanner (System.in);
        int x,y;
        int m [] [] = new int [5][5];
        for (x=0 ; x<5 ; x++){
        for (y=0 ; y<5 ; y++){
            m [x] [y] = vacio;
        }
        }
            int MINAX = (int)(Math.random()*5);
            int MINAY = (int)(Math.random()*5);
            m [MINAX][MINAY] = mina;
            
            int TESOROX;
            int TESOROY;
            do {
TESOROX = (int)(Math.random()*4);
TESOROY = (int)(Math.random()*3);
} while ((MINAX == TESOROX) && (MINAY == TESOROY));
m [TESOROX][TESOROY] = tesoro;
// juego
System.out.println("¡BUSCA EL TESORO!");
boolean salir = false;
String c = "";
do {
// pinta el cuadrante
for(y = 3; y >= 0; y--) {
System.out.print(y + "|");
for(x = 0; x < 5; x++) {
if (m [x][y] == intento)
System.out.print("X ");
else
System.out.print(" ");
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");
// pide las coordenadas
System.out.print("Coordenada x: ");
x = Integer.parseInt(System.console().readLine());
System.out.print("Coordenada y: ");
y = Integer.parseInt(System.console().readLine());
// mira lo que hay en las coordenadas indicadas por el usuario
switch(m [x][y]) {
case vacio:
m [x][y] = intento;
break;
case mina:
System.out.println("Lo siento, has perdido.");
salir = true;
break;
case tesoro:System.out.println("Enhorabuena, has encontrado el tesoro.");
salir = true;
break;
default:
}
} while (!salir);
// pinta el cuadrante
for(y = 3; y >= 0; y--) {
System.out.print(y + " ");
for(x = 0; x < 5; x++) {
switch(m [x][y]) {
case vacio:
c = " ";
break;
case mina:
c = "* ";
break;
case tesoro:
c = "€ ";
break;
case intento:
c = "x ";
break;
default:
}
System.out.print(c);
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");
}
}