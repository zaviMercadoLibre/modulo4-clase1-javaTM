import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de n");

        int n = scanner.nextInt();

        System.out.println("ingrese el valor de m");

        int m = scanner.nextInt();

        int i = 1;
        int multiplo = 0;
        while (multiplo!=n)
        {
            if(m%i==0)
            {
                System.out.println(i);
                multiplo++;
            }
            i++;
        }
    }
}
