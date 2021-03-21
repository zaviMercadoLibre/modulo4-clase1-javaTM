import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numnero");
        int a = scanner.nextInt();

        int i=2;
        boolean esPrimo = true;
        while(i!=a)

        {
            if(a==0 || a%i==0)
            {
               esPrimo = false;
                break;
            }
            i++;
        }
        if(esPrimo)
        {
            System.out.println("Es un numero primo");
        }else
        {
            System.out.println("No un numero primo");
        }

    }
}
