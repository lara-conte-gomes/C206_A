public class Jogo1 {
    //personagem do jogo
    public String nome;
    public int pontos;
    public int vida;
    Jogo2 arma;
    public void usarArma(int ptos){
        arma.resistencia -= ptos;
    }
    public void tomarDano(int pto){
        vida -= pto;
    }
}
