
public class Main {

    public static void main(String[] args) {

        Zumbi3 z1 = new Zumbi3();
        z1.vida1 = 100.80;

        Zumbi3 z2 = new Zumbi3();
        z2.vida1 = 150.50;

        System.out.println("A vida do z1 é: " + z1.vida1);
        System.out.println("A vida do z2 é: " + z2.vida1);

        z1 = z2;

        System.out.println("A vida do z1 é: " + z1.vida1);
        System.out.println("A vida do z2 é: " + z2.vida1);
    }
}