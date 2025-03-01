import java.util.Scanner;

//Calculando quanto é necessário de carne para um churrasco

//Esse é um teste de upload

public class Ex09{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int homens, mulheres, criancas;

        System.out.println("Digite quantos homens virão a festa: ");

        homens = in.nextInt();

        System.out.println("Digite quantas mulheres virão a festa: ");

        mulheres = in.nextInt();

        System.out.println("Digite quantas crianças virão a festa: ");

        criancas = in.nextInt();

        float carneh, carnem, carnec, carneTotal, carneMargem;

        carneh = homens * 400;

        carnem = mulheres * 320;

        carnec = criancas * 200;

        carneTotal = carneh+carnem+carnec;

        carneMargem = (carneTotal*20)/100;

        System.out.println("O total de carne para o churrasco, em quilos, deve ser igual a " + (carneTotal + carneMargem)/1000 + "kg");
    }
}