import java.util.Scanner;

public class Ejercicio4
{

    public static boolean esPrimo(int a)
    {
        int i=2;
        boolean primo = true;
        while(i!=a)
        {
            if(a%i==0)
            {
                primo= false;
                break;
            }
            i++;
        }
        return primo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numnero");
        int a = scanner.nextInt();
        int count = 2;
        while(a>0)
        {
            if(esPrimo(count))
            {
                System.out.println(count);
                a--;
            }
            count++;
        }
    }
}
