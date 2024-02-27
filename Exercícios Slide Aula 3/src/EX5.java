import java.util.Random;
import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int i;//variável para o for
        int num;
        int x = rand.nextInt(10) + 1;//Gera um número de 1 a 10

        do{
            System.out.println("Digite o número gerado: ");
            num = entrada.nextInt();

            if(num != x)
            {
                System.out.println("Errou");
            }
        }while(x != num);

        System.out.println("Parabéns!Você acertou");

        entrada.close();
    }
}
