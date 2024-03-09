
public class Main {

    public static void main(String[] args) {

        Zumbi2 z1 = new Zumbi2();
        z1.nome = "Zé";
        z1.vida = 100.9;

        Zumbi2 z2 = new Zumbi2();
        z2.nome = "Wes";
        z2.vida = 80.6;

        System.out.println("O nome do zumbi 1 é: " + z1.nome);
        System.out.println("O nome do zumbi 2 é: " + z2.nome);

        z2.transfereVida(z1, 40);

        System.out.println("A vida do zumbi 1 é: " + z1.vida);
        System.out.println("A vida do zumbi 2 é: " + z2.vida);

    }
}