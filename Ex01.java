import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, resultado;

        System.out.println("Digite um número inteiro:\t");

        x = in.nextInt();

        resultado = x - 1;

        System.out.print("o número antecessor a " + x + " é igual a " + resultado);

    }
}