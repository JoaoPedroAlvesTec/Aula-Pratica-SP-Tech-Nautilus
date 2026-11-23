package school.sptech;

public enum TipoAcao {
    ATAQUE(10, 10),
    DEFESA(10, 0),
    COMBO(30, 20),
    ESPERA(0, 0);

    private Integer custoEnergia;
    private Integer danoBase;

    TipoAcao(Integer custoEnergia, Integer danoBase) {
        this.custoEnergia = custoEnergia;
        this.danoBase = danoBase;
    }

    public Integer getCustoEnergia() {
        return custoEnergia;
    }

    public Integer getDanoBase() {
        return danoBase;
    }
}
