public class Computador {
    public String marca;
    public float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwarebasic;
    MemoriaUSB memoria;

    //método construtor do sistema operacional
    //método construtor do hardware básico
    public Computador(){
        sistemaOperacional = new SistemaOperacional();

        hardwarebasic = new HardwareBasico[50];
    }

    public void addHardware(HardwareBasico h){
        for(int i = 0; i < hardwarebasic.length; i++)
        {
            if(hardwarebasic[i] == null)
            {
                hardwarebasic[i] = h;
                break;
            }
        }
    }

    public void mostraPCConfigs(){
        System.out.println("A marca do computador é: " + this.marca);
        System.out.println("O preço do computador é: " + this.preco);
        System.out.println("A memória dele tem o nome: " + this.memoria.nome);
        System.out.println("A memória dele tem capacidade: " + this.memoria.capacidade);
        System.out.println("O sistema operacional tem nome: " + this.sistemaOperacional.nome);
        System.out.println("O sistema operacional tem tipo: " + this.sistemaOperacional.tipo);

        for(int i = 0; i < hardwarebasic.length; i++)
        {
            if(hardwarebasic[i] != null)
            {
                System.out.println("O hardware tem o nome: " + this.hardwarebasic[i].nome);
                System.out.println("O hardware tem a capacidade de: " + this.hardwarebasic[i].capacidade);
            }
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoria = musb;
    }
}

