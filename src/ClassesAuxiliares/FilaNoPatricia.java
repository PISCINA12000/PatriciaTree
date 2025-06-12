package ClassesAuxiliares;

import Arvore.NoPatricia;

public class FilaNoPatricia {
    private NoFilaPatricia ini;
    private NoFilaPatricia fim;

    //Construtores
    public FilaNoPatricia(NoFilaPatricia ini, NoFilaPatricia fim) {
        this.ini = ini;
        this.fim = fim;
    }

    public FilaNoPatricia() {
        this(null,null);
    }

    //Métodos
    public void enqueue(NoPatricia no){
        NoFilaPatricia novo = new NoFilaPatricia();
        novo.setProx(null);
        novo.setNo(no);
        if(ini == null){ //ninguem na fila
            ini = fim = novo;
        }
        else{
            fim.setProx(novo);
            fim = novo;
        }
    }

    public NoPatricia dequeue(){
        NoPatricia no = ini.getNo();
        if(ini==fim){
            ini = fim = null;
        }
        else{
            ini = ini.getProx();
        }
        return no;
    }

    public boolean isEmpty(){
        return ini==null;
    }
}
