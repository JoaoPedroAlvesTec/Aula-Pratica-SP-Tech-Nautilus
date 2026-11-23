package school.sptech;

public class Acao {
    private TipoAcao tipo;
    private Integer dano;
    private Integer turno;

    public Acao(TipoAcao tipo, Integer dano, Integer turno) {
        this.tipo = tipo;
        this.dano = dano;
        this.turno = turno;
    }

    public TipoAcao getTipo() {
        return tipo;
    }

    public Integer getDano() {
        return dano;
    }

    public Integer getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "tipo=" + tipo +
                ", dano=" + dano +
                ", turno=" + turno +
                '}';
    }
}
