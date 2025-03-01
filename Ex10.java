
import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int socios, criancas, pagantes, publicoTotal, ingresso;

        System.out.println("Digite o valor do ingresso: ");

        ingresso = in.nextInt();

        System.out.println("Digite o número de sócios presentes no evento: ");

        socios = in.nextInt();

        System.out.println("Digite o número de crianças presentes no evento: ");

        criancas = in.nextInt();

        System.out.println("Digite o número de pagantes presentes no evento: ");

        pagantes = in.nextInt();

        publicoTotal = socios + criancas + pagantes;

        float ingressoSocios, ingressoPagantes, ingressoCriancas, rendaTotal;

        ingressoSocios = (ingresso - (ingresso*30)/100);

        ingressoCriancas = 0;

        ingressoPagantes = ingresso;    

        rendaTotal = (ingressoSocios * socios) + (ingressoCriancas * criancas) + (ingressoPagantes * pagantes);

        System.out.println("A renda total do evento foi de R$" + rendaTotal + ",00");

        System.out.println("O público total do evento foi de " + publicoTotal + " pessoas");

        float valorPerdido;

        valorPerdido = (ingresso * publicoTotal) - rendaTotal;

        System.out.println("O valor perdido foi de R$" + valorPerdido + ",00");
    }
}
