public class Zumbi2 {

    public double vida;

    public String nome;

    public double mostraVida(){
        return this.vida;
    }//retorna um double
    public void transfereVida(Zumbi2 ZumbiAlvo, double quantia){
        vida -= quantia;
        ZumbiAlvo.vida += quantia;
    }//não retorna nada

}
