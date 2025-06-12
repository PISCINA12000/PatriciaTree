package ClassesAuxiliares;

public class NoPilhaString {
    private String palavra;
    private NoPilhaString prox;

    //Construtores
    public NoPilhaString(String palavra, NoPilhaString prox) {
        this.palavra = palavra;
        this.prox = prox;
    }

    public NoPilhaString() {
        this("",null);
    }

    //Gets e Sets
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public NoPilhaString getProx() {
        return prox;
    }

    public void setProx(NoPilhaString prox) {
        this.prox = prox;
    }
}
