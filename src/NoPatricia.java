public class NoPatricia {
    private String palavra;
    private NoPatricia[] vLig;
    private boolean fim;

    //Construtores
    public NoPatricia(String palavra) {
        this.palavra = palavra;
        this.vLig = new NoPatricia[26];
        this.fim = false;
    }

    //gets e sets
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public NoPatricia getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(NoPatricia no, int pos) {
        this.vLig[pos] = no;
    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }
}
