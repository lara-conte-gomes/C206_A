public class Zumbi4 {
    public double vida;

    public String nome;

    boolean x;

    public double mostrVida(){
        return this.vida;
    }

    public boolean transfereVida(Zumbi4 ZumbiAlvo, double quantia){
        if(ZumbiAlvo.vida > quantia) {
            ZumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;
        }
        else{
            return false;
        }
    }
}
