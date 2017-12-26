/*
 * EQUIPE : Joyce Mikaella das Mercês Aciole
            Pedro Henrique Ferreira Ramos
 */
package modelo;

/**
 *
 * @author pedru
 */
public class Rendimento {
    private double investimento;
    private double lucro;

    public Rendimento(double investimento) {
        this.investimento = investimento;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
