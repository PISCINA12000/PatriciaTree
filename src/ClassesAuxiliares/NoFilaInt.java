package ClassesAuxiliares;

public class NoFilaInt {
    private int info;
    private NoFilaInt prox;

    //Construtores
    public NoFilaInt(int info, NoFilaInt prox) {
        this.info = info;
        this.prox = prox;
    }

    public NoFilaInt() {
        this(0,null);
    }

    //Gets e Sets
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoFilaInt getProx() {
        return prox;
    }

    public void setProx(NoFilaInt prox) {
        this.prox = prox;
    }
}
