import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float matematica, portugues, media;

        System.out.print("Digite e nota da disciplina de Matemática: ");

        matematica = in.nextFloat();

        System.out.print("Digite e nota da disciplina de Português: ");

        portugues = in.nextFloat();

        media = (matematica+portugues)/2;

        System.out.println("A média das notas será igual a " + media);

        }
    
}
