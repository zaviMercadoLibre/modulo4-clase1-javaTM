import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese un numero");

        int number = scanner.nextInt();


        int a = 1;

        while(a <= number)
        {
            if(a%2==0)
            {
                System.out.println(a);
            }
            a++;

        }


    }
}
