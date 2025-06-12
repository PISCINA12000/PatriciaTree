package ClassesAuxiliares;

import Arvore.NoPatricia;

public class NoPilhaPatricia {
    private NoPatricia info;
    private NoPilhaPatricia prox;

    //Construtores
    public NoPilhaPatricia(NoPatricia info, NoPilhaPatricia prox) {
        this.info = info;
        this.prox = prox;
    }

    public NoPilhaPatricia() {
        this(null,null);
    }

    //Gets e Sets
    public NoPatricia getInfo() {
        return info;
    }

    public void setInfo(NoPatricia info) {
        this.info = info;
    }

    public NoPilhaPatricia getProx() {
        return prox;
    }

    public void setProx(NoPilhaPatricia prox) {
        this.prox = prox;
    }
}
