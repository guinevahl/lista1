import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float C, F;

        System.out.println("Digite de temperatura em graus: ");

        C = in.nextFloat();

        F= ((9*(C/5)) + 32);

        System.out.println("O valor da temperatura em Fahrenheit é igual a " + F);
    }
    
}
