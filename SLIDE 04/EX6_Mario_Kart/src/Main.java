
public class Main {
    public static void main(String[] args) {
        //Informações dos pilotos
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Ayrton Senna";
        p2.nome = "Michael Andretti";

        p1.vilao = false;
        p2.vilao = true;

        //Informações do motor
        Motor m1 = new Motor();
        Motor m2 = new Motor();

        m1.cilindradas = "150";
        m2.cilindradas = "100";

        m1.velocidadeMaxima = 150f;
        m2.velocidadeMaxima = 100f;

        //Informações do Kart
        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome = "Fiat";
        k2.nome = "Volkswagen";

        //Fazendo a agregação dos pilotos com os karts
        k1.piloto = p1;
        k2.piloto = p2;

        //Fazendo a composição do motor com o Kart
        k1.motor = m1;
        k2.motor = m2;

        //chamando os métodos criados
        k1.motor.mostraInfo();
        k2.motor.mostraInfo();

        k1.pular();

        k1.piloto.soltaSuperPoder();
        k2.piloto.soltaSuperPoder();

        k1.soltarTurbo(k1.motor.velocidadeMaxima);
        k2.soltarTurbo(k2.motor.velocidadeMaxima);

        k1.fazerDrift();
    }
}