import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int eleitores, vv, vb, vn;

        System.out.println("Digite o total de eleitores: ");

        eleitores = in.nextInt();

        System.out.println("Digite o total de votos válidos: ");

        vv = in.nextInt();

        System.out.println("Digite o total de votos em branco: ");

        vb = in.nextInt();

        vn = eleitores - vv - vb;

        System.out.println("O total de votos nulos é igual a " + vn);

        // Condição para que o número de votos seja igual ao  número total de eleitores

        if(vn < 0){

            System.out.println("Votos totais não coincidem com a quantidade de eleitores. Refaça a contagem.");

        }else{

          float pervv, pervb, pervn;
          
          pervv = (vv*100)/eleitores;

          pervb = (vb*100)/eleitores;

          pervn = (vn*100)/eleitores;

          System.out.println("Em um total de " + eleitores + " eleitores, foram analisados os seguintes percentuais:\nPercentual de Votos Válidos: " + pervv + "%\nPercentual de Votos em Branco: " + pervb + "%\nPercentual de Votos Nulos: "+ pervn +"%");

        }
    }
}
