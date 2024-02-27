import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da turma de C206/C06: ");
        int numAlunos = entrada.nextInt();

        switch(numAlunos){
            case 10:
            case 20:
                System.out.println("A sala é a 1-16");
                break;
            case 30:
                System.out.println("A sala é a 1-22");
                break;
            default:
                System.out.println("O aluno não estará em nenhuma sala, sem salas disponíveis");
        }

        entrada.close();
    }
}
