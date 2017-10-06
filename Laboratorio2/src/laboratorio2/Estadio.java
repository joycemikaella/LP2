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
public class Estadio {
    
    
    int quantideTimes = 0;
    private Clube times[] = new Clube[4];

    public Clube[] getTimes() {
        return times;
    }

    public void setTimes(Clube time) {
        this.times[this.quantideTimes] = time;
        this.quantideTimes++;
    }
}
