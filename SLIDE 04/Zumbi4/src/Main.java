
public class Main {

    public static void main(String[] args) {

        Zumbi4 z1 = new Zumbi4();
        z1.nome = "Zé";
        z1.vida = 100.9;

        Zumbi4 z2 = new Zumbi4();
        z2.nome = "Wes";
        z2.vida = 80.6;

        System.out.println("Vida do zumbi 1 é: " + z1.vida);
        System.out.println("Vida do zumbi 2 é: " + z2.vida);

        if(z2.transfereVida(z1, 1000)){
            System.out.println("Deu certo");
            System.out.println("A vida do zumbi 1 é: " + z1.vida);
            System.out.println("A vida do zumbi 2 é: " + z2.vida);
        }else {
            System.out.println("Não deu certo.");
        }
    }
}