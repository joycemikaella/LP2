


package laboratorio3;

import java.util.Scanner;



/**
 *
 * @author Joyce Mikaella
 */
public class AnimalEstimacao {

public void brincar (){
    System.out.println("MIAU");
}
    public static void main(String[] args) {
     
        Gato cat1 = new Gato();
        cat1.setRaca("Siamês");
        cat1.setPatas(4);
        cat1.caminha();
        cat1.come();
        cat1.setNome ("Prince");
        ;
        
                
 System.out.println("RAÇA : " + cat1.getRaca());  
 System.out.println("NOME : " + cat1.getNome());  
 
    }
    
}
