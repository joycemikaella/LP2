/*
 * EQUIPE : Joyce Mikaella das Mercês Aciole
            Pedro Henrique Ferreira Ramos
 */
package modelo;

/**
 *
 * @author pedru
 */
public class Produto {
    public int codigo = 1;
    private String nome;
    private double valor_venda;
    private double valor_compra;
    private int quantidade;
    
    public Produto(int indice, String nome, double valor_venda, double valor_compra, int quantidade) {
        this.codigo = indice++;
        this.nome = nome;
        this.valor_venda = valor_venda;
        this.valor_compra = valor_compra;
        this.quantidade = quantidade;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int indice) {
        this.codigo = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor) {
        this.valor_venda = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
    
    public String toString(){
        return "Código: " + getCodigo() + "      Nome: " + getNome() + "         Preço: " + getValor_venda() + "      Quantidade disponível: " + getQuantidade();
    }
}
