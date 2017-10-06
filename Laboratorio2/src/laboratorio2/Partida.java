/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio2;
  import java.util.Date;

/**
 *
 * @author Joyce Mikaella
 */
public class Partida {
 private Date data ;
 private Date hora;
  private Arbitro juizes[] = new Arbitro[5];
    private int quantidadeArbitro=0;


	

    
    public Arbitro[] getJuizes() {
        return juizes;
    }

    public void setJuizes(Arbitro juizes) {
        this.juizes[this.quantidadeArbitro] = juizes;
        this.quantidadeArbitro++;
    }  

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getQuantidadeArbitro() {
        return quantidadeArbitro;
    }

    public void setQuantidadeArbitro(int quantidadeArbitro) {
        this.quantidadeArbitro = quantidadeArbitro;
    }
}
