/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Joyce Mikaella
 */
public class Arbitro extends Partida {
    private String nome , funcao;

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}