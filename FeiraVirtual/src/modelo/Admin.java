/*
 * EQUIPE : Joyce Mikaella das Mercês Aciole
            Pedro Henrique Ferreira Ramos
 */
package modelo;

/**
 *
 * @author pedru
 */
public class Admin implements Autenticacao {
    private String nome;
    private String id;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /*public int Verifica(String id, String senha) {
        if (id.equals(getId()) && (senha.equals(getSenha()))) {
            return 1;
        } else {
            return 0;
        }
    }*/

    @Override
    public boolean Autenticar(String senha) {
        return getSenha().equals(senha); //System.out.println("Acesso Permitido!");
        //System.out.println("Acesso Negado!");
    }
}
