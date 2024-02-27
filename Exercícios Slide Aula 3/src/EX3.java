import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int npa, soma, np3, nfa;

        System.out.print("Digite a NPA do aluno: ");
         npa = entrada.nextInt();

        if(npa >=60)
        {
            System.out.println("Aluno passou, não precisa fazer NP3!!");
        }
        else
        {
            System.out.println("Aluno precisa fazer NP3");

            System.out.println("Informe a nota da NP3: ");
             np3 = entrada.nextInt();

            soma = np3 + npa;

            nfa = soma / 2;

            if (nfa >= 50)
            {
                System.out.println("Aluno aprovado");
            }
            else
            {
                System.out.println("ALuno reprovado");
            }

        }
        entrada.close();
      }
    }

