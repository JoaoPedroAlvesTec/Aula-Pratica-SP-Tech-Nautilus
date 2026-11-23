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

     public boolean detectarLoop() {
        Integer n = historico.size();

        if (n < 3) return false;

        TipoAcao acao1 = historico.get(n - 1).getTipo();
         TipoAcao acao2 = historico.get(n - 2).getTipo();
         TipoAcao acao3 = historico.get(n - 3).getTipo();

         if (acao1.equals(acao2) && acao2.equals(acao3)) {
             return true;
         }

         return false;
     }


    public List<Acao> getHistorico() {
        return historico;
    }
}
