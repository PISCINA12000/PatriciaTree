package ClassesAuxiliares;

import Arvore.NoPatricia;

public class NoFilaPatricia {
    private NoPatricia no;
    private NoFilaPatricia prox;

    //Construtores
    public NoFilaPatricia(NoPatricia no, NoFilaPatricia prox) {
        this.no = no;
        this.prox = prox;
    }

    public NoFilaPatricia() {
        this(null,null);
    }

    //Gets e sets
    public NoPatricia getNo() {
        return no;
    }

    public void setNo(NoPatricia no) {
        this.no = no;
    }

    public NoFilaPatricia getProx() {
        return prox;
    }

    public void setProx(NoFilaPatricia prox) {
        this.prox = prox;
    }
}
