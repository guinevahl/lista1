import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, y;

        System.out.print("Digite um número inteiro: ");

        x = in.nextInt();

        y = x*x;

        System.out.println("O quadrado de "+ x + " é igual a "+ y);

    }
}
