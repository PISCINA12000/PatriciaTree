public class ArvorePatricia {
    private NoPatricia raiz;

    //Construtores
    public ArvorePatricia() {
        this.raiz = null;
    }

    //metodos
    public void inserir(String chave){
        NoPatricia ant, aux, novo, novaPalavra;
        ant = aux = raiz;
        int nivel, indice, novoIndice, qtde;
        String novaChave, restante, chaveFinal;

        if(raiz == null) {
            raiz = new NoPatricia(chave);
            raiz.setFim(true);
        }
        else{
            for(nivel = 0; nivel<chave.length(); nivel++){
                indice = getIndice(chave.charAt(nivel));

                if(aux == null){ //se verdade então chegou no nivel mais baixo da arvore sem encontrar o prefixo
                    restante = chave.substring(nivel, chave.length());
                    novaPalavra = new NoPatricia(restante);
                    novaPalavra.setFim(true);
                    ant.setvLig(novaPalavra, indice);
                    nivel = chave.length(); //sair do loop do for
                }
                else {
                    qtde = encontrarPrefixo(aux.getPalavra(), chave.substring(nivel, chave.length()));
                    if (qtde < aux.getPalavra().length()) { //realizar o split

                        //o novo no 'pai'
                        novaChave = aux.getPalavra().substring(0, qtde); //comecar a fazer o novo no
                        novo = new NoPatricia(novaChave);
                        novo.setFim(false); //nao eh final de uma palavra

                        //o novo filho, que na verdade eu apenas mudo a string, para preservar os ponteiros
                        restante = aux.getPalavra().substring(qtde, aux.getPalavra().length());
                        aux.setPalavra(restante); //o no atual sera sobrescrito so com as letras restantes
                        novoIndice = getIndice(restante.charAt(0)); //definir a nova posicao do novo no
                        novo.setvLig(aux, novoIndice);

                        //definir a ligacao do avo
                        if(aux==ant) //sao a raiz
                            raiz = novo;
                        else
                            ant.setvLig(novo, indice);

                        //o novo no que esta chegando
                        chaveFinal = chave.substring(nivel + qtde, chave.length()); //obter o final da chave
                        novaPalavra = new NoPatricia(chaveFinal); //esse sera o no da palavra que estou inserindo
                        novoIndice = getIndice(chaveFinal.charAt(0));
                        novo.setvLig(novaPalavra, novoIndice);
                        novaPalavra.setFim(true);
                        nivel = chave.length(); //forcar a saida do for
                    } else if (nivel + qtde == chave.length()) { //nesse caso eu apenas mudo o atributo 'fim' para true do meu aux
                        aux.setFim(true);
                        nivel = chave.length(); //forcar a saida do for
                    } else { //continuar andando na arvore
                        ant = aux;
                        nivel += qtde;
                        if (nivel < chave.length()) {
                            indice = getIndice(chave.charAt(nivel));
                            aux = aux.getvLig(indice);
                            nivel--; //quando o for der ++ não vai corromper a posicao ideal
                        }
                    }
                }
            }
        }
    }

    //metodos auxiliares
    public int getIndice(char c){
        c = Character.toLowerCase(c);
        return c - 'a';
    }

    public int encontrarPrefixo(String a, String b){
        int soma = 0;
        for(int i=0; i<a.length() && i<b.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                soma++;
            }
        }
        return soma;
    }

    public void exibirPalavras() {
        exibirPalavras(raiz, "");
    }

    private void exibirPalavras(NoPatricia no, String prefixo) {
        if (no != null) {
            String atual = prefixo + no.getPalavra();
            if (no.isFim()) {
                System.out.println(atual);
            }
            for (int i = 0; i < 26; i++) {
                exibirPalavras(no.getvLig(i), atual);
            }
        }
    }
}
