package entities;


import java.util.ArrayList;
import java.util.List;

public class Pagamento {

    private String empresa;
    private List<Imposto> imposto;

    public Pagamento(String empresa) {
        this.empresa = empresa;
        this.imposto = new ArrayList<>();
    }

    public void adicionarImpostos(Imposto imposto) {
        this.imposto.add(imposto);
    }

    public void resumo() {
        for (Imposto imposto : imposto) {
                System.out.println(imposto.pegarDescricao() + ": R$ " + imposto.calcularImpostos());
            }
    }
}
