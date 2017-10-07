/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author Joyce Mikaella
 */
public class Animal {
    private int patas;
    private String raca;
   
    
   public void caminha (){
       if ( patas > 0) {
          System.out.println("Bichinho passando..."); 
       }else
      System.out.println("Bichinho parou");
      }
   
   public void come (){
  
        System.out.println("NHAC NHAC NHAC");   
     
   }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

 
      
}
