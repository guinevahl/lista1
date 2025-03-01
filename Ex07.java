import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float horas, d, v, minutos;

        System.out.print("Digite a velocidade média em km/h: ");

        v = in.nextFloat();

        System.out.print("Digite a distância em km: ");

        d = in.nextFloat();

        horas = d/v;

        minutos = horas*60;

        System.out.println("A viagem levará "+ horas + " horas que, convertendo para minutos, será " + minutos);

    }
}
