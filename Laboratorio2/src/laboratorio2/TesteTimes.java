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
public class TesteTimes {

      public static void imprimeTimeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideTimes(); i++) {
            System.out.println("Clube: " + e.getTimes()[i].getNome());

        }
    }

    public static void main(String[] args) {
       
        Clube time1 = new Clube();
        Clube time2 = new Clube();
        Clube time3 = new Clube();

        time1.setNome("Flamengo");
        time2.setNome("Fluminense");
        time3.setNome("Sao Paulo");

        Estadio e1 = new Estadio();
        Estadio e2 = new Estadio();

        e1.setNome("Maracana");
        e1.setTimes(time1);
        e1.setTimes(time2);
        e2.setNome("Morumbi");
        e2.setTimes(time3);

        System.out.println("Estadio: " + e1.getNome());
        imprimeTimeEstadio(e1);

        System.out.println("Estadio: " + e2.getNome());
        imprimeTimeEstadio(e2);
    }
    
}
