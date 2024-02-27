import java.util.Scanner;

public class Trailler_EX2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float soma;
        float med;

        System.out.print("Digite a quantidade de lanches consumidos na primeira hora: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite a quantidade de lanches consumidos na segunda hora: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite a quantidade de lanches consumidos na terceira hora: ");
        int numero3 = entrada.nextInt();

        //soma da quantidade de lanches
        soma = numero1 + numero2 + numero3;

        //cálculo da média de lanches
        med = (soma / 3.0f);

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da média é: " + med);

        entrada.close();
    }
}
