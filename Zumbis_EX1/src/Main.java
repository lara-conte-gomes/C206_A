
public class Main {

    public static void main(String[] args) {

        Zumbis z = new Zumbis();
        z.idade = 1000;
        z.forca= 100;
        z.vida = 200;
        z.altura = 1.50f;

        System.out.println("O nome do zumbi eh: " + z.nome);
        z.andar();
        z.seAlimentar();
        z.iniciar();
        System.out.println("O nome do zumbi eh: " + z.nome);

        z.parado();
        z.nome = "Joca";
        z.status();
        z.perseguir();
    }
}