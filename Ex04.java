import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float a, b , h;

        System.out.print("Digite a base do triangulo: ");

        b = in.nextFloat();

        System.out.print("Digite a altura do triangulo: ");

        h = in.nextFloat();

        a = (b * h)/2;

        System.out.print("A área do triangulo é igual a "+ a);
    }
}
