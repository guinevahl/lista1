import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, y, resultado;

        System.out.println("Digite um número qualquer: ");

        x = in.nextInt();

        y = ((x*20)/100);

        resultado = x + y;

        System.out.print(resultado);

    }
}
