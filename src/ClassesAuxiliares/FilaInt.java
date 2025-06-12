package ClassesAuxiliares;

public class FilaInt {
    private NoFilaInt ini;
    private NoFilaInt fim;

    //Construtores
    public FilaInt(NoFilaInt ini, NoFilaInt fim) {
        this.ini = ini;
        this.fim = fim;
    }

    public FilaInt() {
        this(null,null);
    }

    //Metodos
    public void enqueue(int info){
        NoFilaInt novo = new NoFilaInt();
        novo.setProx(null);
        novo.setInfo(info);
        if(ini == null){ //ninguem na fila
            ini = fim = novo;
        }
        else{
            fim.setProx(novo);
            fim = novo;
        }
    }

    public int dequeue(){
        int info = ini.getInfo();
        if(ini==fim){
            ini = fim = null;
        }
        else{
            ini = ini.getProx();
        }
        return info;
    }

    public boolean isEmpty(){
        return ini==null;
    }
}
