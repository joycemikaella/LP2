/*
 * EQUIPE : Joyce Mikaella das Mercês Aciole
            Pedro Henrique Ferreira Ramos
 */
package modelo;

/**
 *
 * @author pedru
 */
public class Pedido {
    private Object codigo;
    private String nome;
    private double valor;
    private double valor_compra;
    private int quantidade;

    //CONSTRUTOR
    public Pedido(Object codigo, String nome, double valor, double valor_compra, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.valor_compra = valor_compra;
        this.quantidade = quantidade;
    }

    public Object getCodigo() {
        return codigo;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_venda) {
        this.valor_compra = valor_venda;
    }

    public void setCodigo(Object codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }  

    @Override
    public String toString() {
        return "Pedido{" + "nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }
}
