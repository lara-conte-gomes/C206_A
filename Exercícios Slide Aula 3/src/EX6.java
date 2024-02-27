import java.util.Random;
import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int num;
        int x = rand.nextInt(10) + 1;//Gera número de 1 até 10

        do {
            System.out.println("Digite qual número foi gerado: ");
            num = entrada.nextInt();

            if (num < x) {
                System.out.print("Seu número escolhido é menor que o que foi gerado. ");
            } else if (num > x) {
                System.out.print("Seu número escolhido é maior que o que foi gerado. ");
            }

        }while(num != x);

        System.out.println("Parabéns! Você acertou");

        entrada.close();
    }
}
