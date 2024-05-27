package br.Funcionalidade;
import br.RedesSociais.Exceções.SenhaIncorretaException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedeSocial[] r = new RedeSocial[2];//criando um vetor de redes sociais
        Facebook f = new Facebook();//criando a rede social Facebook
        Twitter t = new Twitter();//crinado a rede social Twitter

        r[0] = f;//guardando a rede social Facebook no vetor de rede social
        r[1] = t;//guardando a rede social Twitter no vetor de rede social

        System.out.println("As redes socais que o usuário possui são: Facebook e Twitter");
        System.out.println("");

        Usuario u1 = new Usuario(r);//criando o Usuário

        Scanner entrada1 = new Scanner(System.in);//entrada do nome de usuário
        Scanner entrada2 = new Scanner(System.in);//entrada do email usuário
        Scanner entrada_op = new Scanner(System.in);//entrada da opção do switch case
        Scanner entrada_senha_facebook = new Scanner(System.in);//entrada da senha da rede social Facebook
        Scanner entrada_numAmigos_facebook = new Scanner(System.in);//entrada do número de amigos na rede social Facebook
        Scanner entrada_senha_Twitter = new Scanner(System.in);//entrada da senha da rede social Twitter
        Scanner entrada_numAmigos_Twitter = new Scanner(System.in);//entrada do número de amigos na rede social Twwitter
        Scanner entrada_op2 = new Scanner(System.in);//entrada da ação que vai se desejar fazer no Facebook
        Scanner entrada_op3 = new Scanner(System.in); //entrada da ação que vai se desejar fazer no Twitter
        Scanner entrada_r1 = new Scanner(System.in); //entrada se deseja continuar no loop do while ou não
        Scanner entrada_f = new Scanner(System.in);//entrada se deseja fazer mais alguma ação no Facebook
        Scanner entrada_t = new Scanner(System.in);//entrada se deseja fazer mais alguma ação no Twitter
        int x;//inteiro para receber a ação que será feita no Facebook
        int z;//inteiro para receber a ação que será feita no Twitter
        int r1 = 1; //variável auxiliar para o while

        System.out.println("Entre com o nome de usuário: ");
        String nome = entrada1.nextLine();

        System.out.println("Entre com o email de usuário: ");
        String email = entrada2.nextLine();

        u1.setNome(nome);
        u1.setEmail(email);

        System.out.println("Digite a opção que deseja (1 - Mostrar nome e email do usuário / 2 - Realizar o cadastro da senha e número de amigos do Facebook / 3 - Realizar o cadastro da senha e número de amigos do Twitter / 4 - Realizar uma ação no Facebook / 5 - Realizar uma ação no Twitter / 6 - Guardar as informações do Usuário num arquivo / 7 - Mostrar Número de amigos nas Redes sociais): ");
        int op = entrada_op.nextInt();

        while (r1 != 0) {

            switch (op) {
                case 1: {
                    System.out.println("Nome do usuário: " + u1.getNome());
                    System.out.println("Email do usuário: " + u1.getEmail());

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
                case 2: {

                    while (true) {
                        System.out.println("Digite a senha da sua rede social do Facebook (Apenas números): ");
                        String senha_facebook = entrada_senha_facebook.nextLine();

                        //exceção unchecked criada para verificar se a senha possui apenas números, se tiver String vai lançar um erro
                        try {
                            r[0].verificaSenha(senha_facebook);
                            System.out.println("Senha é válida");
                            break;
                        } catch (SenhaIncorretaException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Tente novamente");
                        }

                        r[0].setSenha(senha_facebook);
                    }

                    System.out.println("Digite o número de amigos que se possui na rede social Facebook: ");
                    int num_facebook = entrada_numAmigos_facebook.nextInt();
                    r[0].setNumAmigos(num_facebook);

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();

                }
                break;
                case 3: {
                    while (true) {
                        System.out.println("Digite a senha da sua rede social do Twitter (Apenas números): ");
                        String senha_Twitter = entrada_senha_Twitter.nextLine();

                        //exceção unchecked criada para verificar se a senha possui apenas números, se tiver String vai lançar um erro
                        try {
                            r[1].verificaSenha(senha_Twitter);
                            System.out.println("Senha é válida");
                            break;
                        } catch (SenhaIncorretaException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Tente novamente");
                        }

                        r[1].setSenha(senha_Twitter);
                    }

                    System.out.println("Digite o número de amigos que se possui na rede social Twitter: ");
                    int num_Twitter = entrada_numAmigos_Twitter.nextInt();

                    r[1].setNumAmigos(num_Twitter);

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
                case 4: {
                    int xrs = 1;//variável auxiliar para o while

                    while(xrs != 0) {
                        System.out.println("Escolha uma ação para ser feita no Facebook (1 - Postar Foto / 2 - Fazer Streaming / 3 - Compartilhar): ");
                        x = entrada_op2.nextInt();

                        for (RedeSocial s : u1.redes) {
                            if (x == 1) {
                                if (s instanceof Facebook) {
                                    Facebook face1 = (Facebook) f;
                                    face1.postarFoto();
                                }
                            } else if (x == 2) {
                                if (s instanceof Facebook) {
                                    Facebook face2 = (Facebook) f;
                                    face2.fazStreaming();
                                }
                            } else if (x == 3) {
                                if (s instanceof Facebook) {
                                    Facebook face3 = (Facebook) f;
                                    face3.compartilhar();
                                }
                            }
                            else {
                                System.out.println("Número não existe, tente de novo");
                            }
                        }

                        System.out.println("Deseja fazer mais alguma operação no Facebook? (1 pra sim e 0 pra não): ");
                        xrs = entrada_f.nextInt();
                    }

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
                case 5: {
                    int xrs2 = 1;//variável auxiliar para o while

                    while(xrs2 != 0) {
                        System.out.println("Escolha uma ação para ser feita no Twitter (1 - Postar Vídeo / 2 - Postar Comentário / 3 - Curtir Publicação): ");
                        z = entrada_op3.nextInt();

                        for (RedeSocial s1 : u1.redes) {
                            if (z == 1) {
                                if (s1 instanceof Twitter) {
                                    Twitter t1 = (Twitter) t;
                                    t1.postarVideo();
                                }
                            } else if (z == 2) {
                                if (s1 instanceof Twitter) {
                                    Twitter t2 = (Twitter) t;
                                    t2.postarComentario();
                                }
                            } else if (z == 3) {
                                if (s1 instanceof Twitter) {
                                    Twitter t3 = (Twitter) t;
                                    t3.curtirPublicacao();
                                }
                            }
                            else{
                                System.out.println("Número não existe, tente de novo");
                            }
                        }

                        System.out.println("Deseja fazer mais alguma ação no Twitter? (1 pra sim e 0 pra não): ");
                        xrs2 = entrada_t.nextInt();
                    }

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
                case 6: {
                    System.out.println("Guardando o nome de usuário e o email no arquivo");

                    //exceção checked criada para guardar o nome do usuário e email dele, se o arquivo não existir vai lançar a exceção
                    try{
                       u1.arquivo();
                    }catch (FileNotFoundException e){
                        System.out.println("Erro: " + e.getMessage());
                    }

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
                case 7:{
                    System.out.println("Mostrar o número de amigos das redes sociais: ");

                    for (RedeSocial r5 : u1.redes) {
                        if(r5 instanceof Facebook) {
                            Facebook face = (Facebook) f;
                            System.out.println("Número de amigos do Facebook: " + face.getNumAmigos());
                        }

                        if(r5 instanceof Twitter) {
                            Twitter tw = (Twitter) t;
                            System.out.println("Número de amigos do Twitter: " + tw.getNumAmigos());
                        }

                    }

                    System.out.println("Deseja fazer mais alguma operação? (0-pra não e 1 pra sim): ");
                    r1 = entrada_r1.nextInt();
                }
                break;
            }

            if (r1 == 1) {
                System.out.println("Digite a opção que deseja (1 - Mostrar nome e email do usuário / 2 - Realizar o cadastro da senha e número de amigos do Facebook / 3 - Realizar o cadastro da senha e número de amigos do Twitter / 4 - Realizar uma ação no Facebook / 5 - Realizar uma ação no Twitter / 6 - Guardar as informações do Usuário num arquivo / 7 - Mostrar Número de amigos nas Redes sociais): ");
                op = entrada_op.nextInt();
            }
        }

        //fechando todos os Scanners
        entrada1.close();
        entrada2.close();
        entrada_op.close();
        entrada_senha_facebook.close();
        entrada_numAmigos_facebook.close();
        entrada_senha_Twitter.close();
        entrada_numAmigos_Twitter.close();
        entrada_op2.close();
        entrada_op3.close();
        entrada_r1.close();
        entrada_f.close();
        entrada_t.close();
    }
}