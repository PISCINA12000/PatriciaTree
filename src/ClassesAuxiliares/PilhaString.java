package ClassesAuxiliares;

public class PilhaString {
    private NoPilhaString topo;

    //Construtores
    public PilhaString(NoPilhaString topo) {
        this.topo = topo;
    }

    public PilhaString() {
        this(null);
    }

    //Metodos
    public void push(String palavra){
        NoPilhaString novo = new NoPilhaString();
        novo.setPalavra(palavra);
        novo.setProx(topo);
        topo = novo;
    }

    public String pop(){
        String palavra = topo.getPalavra();
        topo = topo.getProx();
        return palavra;
    }

    public boolean isEmpty(){
        return topo == null;
    }
}
