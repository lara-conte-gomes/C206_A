

public class Zumbis {
    boolean andar;
    String nome;
    int idade;
    int vida;
    float altura;
    int forca;

    void status(){
        System.out.println("Nome do zumbi: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ele está andando? " + andar);
    }

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40f;
    }

    void andar(){
        System.out.println("Zumbi andando...");
        System.out.println("Zumbi " + nome);
    }

    void seAlimentar(){
        System.out.println("Zumbi se alimentando de frutas...");
    }

    void perseguir(){
        if(andar == true)
            System.out.println("Estou sendo perseguida!!");
        else
            System.out.println("Está tudo bem!");
    }

    void andando(){
        this.andar = true;
    }

    void parado(){
        this.andar = false;
    }
}
