package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private List<Acao> historico;

    public Memoria() {
        this.historico = new ArrayList<>();
    }

    public void registrar(Acao acao) {
        historico.add(acao);
    }

    public Acao ultimaAcao() {
        return historico.getLast();
    }

    /*
     public boolean detectarLoop() {

    }
    */


    public List<Acao> getHistorico() {
        return historico;
    }
}
