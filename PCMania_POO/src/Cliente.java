public class Cliente {
    public String nome;
    public long cpf;
    float soma = 0;
    Computador[] computadores = new Computador[10];

    public float calculaTotalCompra(){

        for(int i = 0; i < computadores.length; i++)
        {
            if(computadores[i] != null)
            {
                soma += computadores[i].preco;
            }
        }
        return soma;

    }
}
