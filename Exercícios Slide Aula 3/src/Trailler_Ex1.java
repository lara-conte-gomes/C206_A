public class Trailler_Ex1 {

    public static void main(String[] args) {

        int primHora = 10;//lanches consumidos na primeira hora
        int segHora = 4;//lanches consumidos na segunda hora
        int terHora = 2;//lanches consumidos na terceira hora
        int x;//variável que recebe a soma dos lanches

        //Soma dos lanches
        x = primHora + segHora + terHora;

        //Cálculo da média
        float med = (x / 3.0f);
        
        System.out.println("O número total de lanches consumidos foram: " + x);
        System.out.println("A média de lanches consumidos foram: " +  med);
    }

}
