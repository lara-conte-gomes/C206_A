import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variável para ir sendo incrementada no vetor de computador
        int a = 0;

        //criando os computadores
        Computador c1 = new Computador();
        Computador c2 = new Computador();
        Computador c3 = new Computador();

        //criar o cliente
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Marcio";
        cliente1.cpf = 5349;

        //Usuário vai poder digitar qual promoção ele quer
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número da promoção que deseja (Digite 1 para promoção 1, 2 para a promoção 2 e 3 para a promoção 3), ou 0 para sair: ");
        int x = entrada.nextInt();

        while(x != 0)
        {
            if(x == 1)
            {
                //colocando o computador 1 no cliente 1
                cliente1.computadores[a] = c1;

                //colocando os dados do computador
                c1.marca = "Positivo";
                c1.preco = 3300.00f;

                //criando o hardware 1 e colocando os dados dele
                HardwareBasico h1 = new HardwareBasico();
                h1.nome = "Pentium Core i3";
                h1.capacidade = 2200;//MHz

                //criando o hardware 2 e colocando os dados dele
                HardwareBasico h2 = new HardwareBasico();
                h2.nome = "Memória RAM";
                h2.capacidade = 8;//Gb

                //criando o hardware 3 e colocando os dados dele
                HardwareBasico h3 = new HardwareBasico();
                h3.nome = "HD";
                h3.capacidade = 500;//Gb

                //método para colocar o hardware dentro do vetor que está na classe computador
                c1.addHardware(h1);
                c1.addHardware(h2);
                c1.addHardware(h3);

                //colocando os dados do sistema operacional
                c1.sistemaOperacional.nome = "Linux Ubuntu";
                c1.sistemaOperacional.tipo = 32;//bits

                //criando a memória USB e colocando os dados dela
                MemoriaUSB m1 = new MemoriaUSB();
                m1.nome = "Acompanha Pen-drive";
                m1.capacidade = 16;//Gb

                //chamando o método
                c1.addMemoriaUSB(m1);

                //chamando o método para mostrar as configurações do PC escolhido
                c1.mostraPCConfigs();

                //incrementando o a, para o caso do cliente escolher outro computador
                a++;
            }
            else if(x == 2)
            {
                //colocando o computador 2 no cliente 1
                cliente1.computadores[a] = c2;

                //colocando os dados do computador
                c2.marca = "Acer";
                c2.preco = 8800.00f;

                //criando o hardware e colocando os dados dele
                HardwareBasico h4 = new HardwareBasico();
                h4.nome = "Pentium Core i5";
                h4.capacidade = 3370;//MHz

                //criando o hardware e colocando os dados dele
                HardwareBasico h5 = new HardwareBasico();
                h5.nome = "Memória RAM";
                h5.capacidade = 16;//Gb

                //criando o hardware e colocando os dados dele
                HardwareBasico h6 = new HardwareBasico();
                h6.nome = "HD";
                h6.capacidade = 1;//Tb

                //método para colocar o hardware dentro do vetor que está na classe computador
                c2.addHardware(h4);
                c2.addHardware(h5);
                c2.addHardware(h6);

                //colocando os dados do sistema operacional
                c2.sistemaOperacional.nome = "Windows 8";
                c2.sistemaOperacional.tipo = 64;//bits

                //criando a memória USB e colocando os dados dela
                MemoriaUSB m2 = new MemoriaUSB();
                m2.nome = "Acompanha Pen-drive";
                m2.capacidade = 32;//Gb

                //chamando o método
                c2.addMemoriaUSB(m2);

                //chamando o método para mostrar as configurações do PC escolhido
                c2.mostraPCConfigs();

                //incrementando o a, para o caso do cliente escolher outro computador
                a++;
            }
            else if(x == 3)
            {
                //colocando o computador 3 no cliente 1
                cliente1.computadores[a] = c3;

                //colocando os dados do computador
                c3.marca = "Vaio";
                c3.preco = 4800.00f;

                //criando o hardware e colocando os dados dele
                HardwareBasico h7 = new HardwareBasico();
                h7.nome = "Pentium Core i7";
                h7.capacidade = 4500;//MHz

                //criando o hardware e colocando os dados dele
                HardwareBasico h8 = new HardwareBasico();
                h8.nome = "Memória RAM";
                h8.capacidade = 32;//Gb

                //criando o hardware e colocando os dados dele
                HardwareBasico h9 = new HardwareBasico();
                h9.nome = "HD";
                h9.capacidade = 2;//Tb

                //método para colocar o hardware dentro do vetor que está na classe computador
                c3.addHardware(h7);
                c3.addHardware(h8);
                c3.addHardware(h9);

                //colocando os dados do sistema operacional
                c3.sistemaOperacional.nome = "Windows 10";
                c3.sistemaOperacional.tipo = 64;//bits

                //criando a memória USB e colocando os dados dela
                MemoriaUSB m3 = new MemoriaUSB();
                m3.nome = "Acompanha HD Externo";
                m3.capacidade = 1;//Tb

                //chamando o método
                c3.addMemoriaUSB(m3);

                //chamando o método para mostrar as configurações do PC escolhido
                c3.mostraPCConfigs();

                //incrementando o a, para o caso do cliente escolher outro computador
                a++;
            }
            System.out.println("Entre com o novo número da promoção que deseja comprar (Digite 1 para promoção 1, 2 para a promoção 2 e 3 para a promoção 3), ou 0 para sair: ");
            x = entrada.nextInt();
        }

        //mostrando o preço total, os dados do cliente e qual computador foi comprado
        System.out.println("Você não quer comprar mais nenhum PC");
        System.out.println("Preço total: " + cliente1.calculaTotalCompra());
        System.out.println("Nome do cliente: " + cliente1.nome);
        System.out.println("CPF do cliente: " + cliente1.cpf);
        System.out.println("O computador que o cliente 1 comprou foi: ");

        //mostrando os dados do(s) computador(es) comprado(s)
        for(int i = 0; i < cliente1.computadores.length; i++)
        {
            if(cliente1.computadores[i] != null)
            {
                System.out.println("Marca do computador " + cliente1.computadores[i].marca);
                System.out.println("Preço: " + cliente1.computadores[i].preco);
                System.out.println("Nome da memória: " + cliente1.computadores[i].memoria.nome);
                System.out.println("Capacidade da memória: " + cliente1.computadores[i].memoria.capacidade);
                System.out.println("O sistema operacional tem nome: " + cliente1.computadores[i].sistemaOperacional.nome);
                System.out.println("O sistema operacional tem tipo: " + cliente1.computadores[i].sistemaOperacional.tipo);
            }
        }
    }
}