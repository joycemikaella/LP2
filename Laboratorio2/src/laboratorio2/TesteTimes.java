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
        Clube time4 = new Clube();
 
        time1.setNome("Flamengo");
        time2.setNome("Fluminense");
        time3.setNome("Sao Paulo");
        time4.setNome("Corinthians");
        
        Estadio e1 = new Estadio();
        Estadio e2 = new Estadio();
        
        Arbitro a1 = new Arbitro();
        Arbitro a2 = new Arbitro();
        a1.setNome("Sergio");
        a2.setNome("Rennan");
        e1.setNome("Maracana");
        e1.setTimes(time1);
        e1.setTimes(time2);
        e2.setNome("Morumbi");
        e2.setTimes(time3);
        e2.setTimes(time4);
        
        System.out.println("Estadio: " + e1.getNome());
        imprimeTimeEstadio(e1);
 System.out.println("Arbitro: " + a1.getNome());
 
        System.out.println("Estadio: " + e2.getNome());
        imprimeTimeEstadio(e2);
        
 System.out.println("Arbitro: " + a2.getNome());
        
        
    }
    
}
