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
public class Estadio extends Clube {
   private String nome, cidade, estado; 
    
    int quantideTimes = 0;
    private Clube times[] = new Clube[4];

    public Clube[] getTimes() {
        return times;
    }

    public void setTimes(Clube time) {
        this.times[this.quantideTimes] = time;
        this.quantideTimes++;
    }
    
     public void setNome ( String n1){
       this.nome = n1;
   }

   @Override
    public String getNome() {
        return nome;
    }

    public int getQuantideTimes() {
        return quantideTimes;
    }

   @Override
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     
}
