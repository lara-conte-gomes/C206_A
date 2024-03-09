public class Kart {
    public String nome;
    Piloto piloto;
    Motor motor;

    public void AdicionarMotor(){
        motor = new Motor();
    }
    public void pular(){
        System.out.println("Kart acabou de pular um obstáculo!");
    }
    public void soltarTurbo(float vel){
        if(vel == 150f)
           System.out.println("Kart soltou o turbo!");
        else
            System.out.println("Não é possível o kart soltar o turbo");
    }
    public void fazerDrift(){
        System.out.println("O kart acabou de fazer um Drift!");
    }
}
