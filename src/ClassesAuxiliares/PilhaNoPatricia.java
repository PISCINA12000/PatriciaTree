package ClassesAuxiliares;

import Arvore.NoPatricia;

public class PilhaNoPatricia {
    private NoPilhaPatricia topo;

    //Construtores
    public PilhaNoPatricia(NoPilhaPatricia topo) {
        this.topo = topo;
    }

    public PilhaNoPatricia() {
        this(null);
    }

    //Metodos
    public void push(NoPatricia no){
        NoPilhaPatricia novo = new NoPilhaPatricia();
        novo.setInfo(no);
        novo.setProx(topo);
        topo = novo;
    }

    public NoPatricia pop(){
        NoPatricia info = topo.getInfo();
        topo = topo.getProx();
        return info;
    }

    public boolean isEmpty(){
        return topo == null;
    }
}
