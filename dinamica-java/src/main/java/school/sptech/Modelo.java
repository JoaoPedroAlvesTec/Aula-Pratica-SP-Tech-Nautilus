package school.sptech;

public abstract class Modelo  {
    private String nome;
    private int vida;
    private int energia;
    private Memoria memoria;

    final Acao executarAcao(TipoAcao tipo, Modelo alvo, int turno) {
        return null;
    }

    abstract Acao executarTurno(TipoAcao tipo, Modelo alvo, int turno);

    void receberDano(int) {

    }

    Boolean estaAtivo() {
       return true;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public Memoria getMemoria() {
        return memoria;
    }


}