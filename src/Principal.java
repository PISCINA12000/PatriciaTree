import Arvore.ArvorePatricia;
import ClassesAuxiliares.CoresNoConsole;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArvorePatricia arvore = new ArvorePatricia();
        int opc;
        String novaPalavra;
        boolean automatico = true; //com automatico como true, o programa executa tudo e mostra os resultados

        //começar o trabalho
        if(automatico){ //executar tudo e mostrar
            automatico(arvore);
        }
        else { //executar com o menu
            apresentacao();
            do {
                opc = menu();
                if (opc > 0) {
                    switch (opc) {
                        case 1: { //processo automatizado
                            automatico(arvore);
                            //seto o 'opc' para 0 para forçar a saída do while
                            opc = 0;
                            break;
                        }
                        case 2: { //inserir na arvore
                            novaPalavra = receberPalavra();
                            arvore.inserir(novaPalavra);
                            System.out.print(CoresNoConsole.VERDE);
                            System.out.println("Palavra inserida: " + novaPalavra);
                            System.out.println(CoresNoConsole.RESET);
                            continuar();
                            break;
                        }
                        case 3: { //exibir nos nivel a nivel
                            System.out.println(CoresNoConsole.CIANO);
                            System.out.println("Exibição Nível a Nível:");
                            System.out.print(CoresNoConsole.RESET);
                            arvore.exibirNivelANivel();
                            System.out.print(CoresNoConsole.VERDE);
                            System.out.println("Exibição concluída!");
                            System.out.print(CoresNoConsole.RESET);
                            continuar();
                            break;
                        }
                        case 4: { //exibir palavras de forma recursiva
                            System.out.println(CoresNoConsole.CIANO);
                            System.out.println("Exibição das palavras de forma Recursiva:");
                            System.out.print(CoresNoConsole.RESET);
                            arvore.exibirPalavrasRecursivo();
                            System.out.println(CoresNoConsole.VERDE);
                            System.out.println("Exibição concluída!");
                            System.out.println(CoresNoConsole.RESET);
                            continuar();
                            break;
                        }
                        case 5: { //exibir palavras de forma iterativa
                            System.out.println(CoresNoConsole.CIANO);
                            System.out.println("Exibição das palavras de forma Iterativa:");
                            System.out.print(CoresNoConsole.RESET);
                            arvore.exibirPalavrasIterativo();
                            System.out.println(CoresNoConsole.VERDE);
                            System.out.println("Exibição concluída!");
                            System.out.println(CoresNoConsole.RESET);
                            continuar();
                            break;
                        }
                        default: {
                            System.out.print(CoresNoConsole.VERMELHO);
                            System.out.println("Opção inválida!!");
                            System.out.print(CoresNoConsole.RESET);
                        }
                    }
                }
            } while (opc > 0);
        }
        despedida();
    }

    private static void apresentacao(){
        System.out.print(CoresNoConsole.CIANO);
        System.out.println("$$$$$$$\\   $$$$$$\\      ");
        System.out.println("$$  __$$\\ $$  __$$\\     ");
        System.out.println("$$ |  $$ |$$ /  $$ |    ");
        System.out.println("$$$$$$$  |$$ |  $$ |    ");
        System.out.println("$$  ____/ $$ |  $$ |    ");
        System.out.println("$$ |      $$ |  $$ |    ");
        System.out.println("$$ |$$\\    $$$$$$  |$$\\ ");
        System.out.println("\\__|\\__|   \\______/ \\__|");
        System.out.println(CoresNoConsole.RESET);
        System.out.print(CoresNoConsole.AZUL);
        System.out.println("Pressione qualquer tecla para começar...");
        System.out.println(CoresNoConsole.RESET);
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(CoresNoConsole.VERMELHO+"Erro na leitura! " + e.getMessage()+CoresNoConsole.RESET);
        }
    }

    private static void despedida(){
        System.out.print(CoresNoConsole.AMARELO);
        System.out.println("\nAté mais.....");
        System.out.print(CoresNoConsole.RESET);
    }

    private static int menu(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("$$\\      $$\\                               ");
        System.out.println("$$$\\    $$$ |                               ");
        System.out.println("$$$$\\  $$$$ | $$$$$$\\  $$$$$$$\\  $$\\   $$\\ ");
        System.out.println("$$\\$$\\$$ $$ |$$  __$$\\ $$  __$$\\ $$ |  $$ |");
        System.out.println("$$ \\$$$  $$ |$$$$$$$$ |$$ |  $$ |$$ |  $$ |");
        System.out.println("$$ |\\$  /$$ |$$   ____|$$ |  $$ |$$ |  $$ |");
        System.out.println("$$ | \\_/ $$ |\\$$$$$$$\\ $$ |  $$ |\\$$$$$$  |");
        System.out.println("\\__|     \\__| \\_______|\\__|  \\__| \\______/ ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("[1] Automatico (Insere palavras, exibe nivel a nivel, exibe as palavras)");
        System.out.println("[2] Inserir");
        System.out.println("[3] Exibir Nós Nível a Nível");
        System.out.println("[4] Exibir TODAS as palavras inseridas (recursivo)");
        System.out.println("[5] Exibir TODAS as palavras inseridas (iterativo)");
        System.out.println("[0] Sair...");

        return leitor.nextInt();
    }

    private static void continuar(){
        System.out.print(CoresNoConsole.CIANO);
        System.out.println("Aperte uma tecla para continuar...");
        System.out.print(CoresNoConsole.RESET);
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(CoresNoConsole.VERMELHO+"Erro na leitura! " + e.getMessage()+CoresNoConsole.RESET);
        }
    }

    private static String receberPalavra(){
        Scanner leitor = new Scanner(System.in);
        System.out.print(CoresNoConsole.CIANO);
        System.out.println("Digite uma palavra para inserir...");
        System.out.print(CoresNoConsole.RESET);
        return leitor.nextLine();
    }

    private static void automatico(ArvorePatricia arvore){
        //inserção de palavras
        arvore.inserir("abelha");
        arvore.inserir("abacate");
        arvore.inserir("abecedalho");
        arvore.inserir("abertura");
        arvore.inserir("aberto");
        arvore.inserir("abelhada");
        arvore.inserir("abelhudo");
        arvore.inserir("carangueijo");
        arvore.inserir("rodolfo");
        arvore.inserir("leandro");
        arvore.inserir("teste");
        arvore.inserir("oi");
        arvore.inserir("cabelo");
        arvore.inserir("cabelada");
        arvore.inserir("cabelasso");
        arvore.inserir("cabelinho");
        arvore.inserir("oloco");
        arvore.inserir("oleo");
        arvore.inserir("oraculo");
        arvore.inserir("oracao");
        arvore.inserir("orta");
        arvore.inserir("lamparina");
        arvore.inserir("lampiao");
        arvore.inserir("lambida");
        arvore.inserir("latido");
        arvore.inserir("laticinio");
        arvore.inserir("latao");
        arvore.inserir("letreiro");
        arvore.inserir("letra");
        arvore.inserir("letrado");
        arvore.inserir("latido");
        arvore.inserir("boi");

        //exibição nível a nível
        System.out.println("Exibição Nível a Nível:");
        arvore.exibirNivelANivel();

        //exibo todas as palavras da minha arvore
        System.out.println("Exibir Recursivo:");
        arvore.exibirPalavrasRecursivo();
        System.out.println("\nExibir Iterativo:");
        arvore.exibirPalavrasIterativo();
    }
}
