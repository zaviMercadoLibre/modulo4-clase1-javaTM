import java.util.Scanner;

public class Ejercicio5
{

    public static int check( int i, int m, char d)
    {
        int posicion , contador = 0;
        String s = Integer.toString(i);
        posicion = s.indexOf(d);
        while(posicion!=-1)
        {
            contador++;

            posicion = s.indexOf(d, posicion +1);
        }
        if(contador==m)
        {
            System.out.println(i);
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese n ");

        Integer n = scanner.nextInt();

        System.out.println("ingrese m ");

        int m = scanner.nextInt();

        System.out.println("ingrese d");

        char d = scanner.next().charAt(0);

        int count = 0;
        Integer numero = 1;

        while(count<n)
        {
            if(check(numero, m, d)==m)
            {
                count++;
            }

            numero++;
        }

    }
}