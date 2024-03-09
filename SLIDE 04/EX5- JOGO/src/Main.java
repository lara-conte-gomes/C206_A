
public class Main {
    public static void main(String[] args) {

        //entrada de 2 personagens
        Jogo1 j1 = new Jogo1();
        Jogo1 j3 = new Jogo1();

        j1.nome = "Feroz";
        j1.pontos = 5000;
        j1.vida = 100;

        j3.nome = "Lutador";
        j3.pontos = 6000;
        j3.vida = 150;

        //entrada de 2 armas
        Jogo2 j2 = new Jogo2();
        Jogo2 j4 = new Jogo2();

        j2.nome = "Brilhante";
        j2.poder = 1000;
        j2.resistencia = 500;
        j2.descricao = "Muito afiada";

        j4.nome = "Escarlate";
        j4.poder = 2000;
        j4.resistencia = 800;
        j4.descricao = "Muito leve";

        j1.arma = j2;
        j3.arma = j4;

        System.out.println("Vida do Feroz antes de usar a arma: " + j1.vida);
        j1.usarArma(2);
        System.out.println("Vida do Feroz depois de usar a arma: " + j1.vida);

        System.out.println("Vida do Feroz antes de tomar dano: " + j1.vida);
        j1.tomarDano(5);
        System.out.println("Vida do Feroz antes depois de tomar dano: " + j1.vida);

        System.out.println("Informações da arma do Feroz: ");
        j1.arma.mostraInfoArma();
    }
}