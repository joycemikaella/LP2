


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
        cat1.setNome ("Prince");
                       
 System.out.println("RAÇA GATO: " + cat1.getRaca());  
 System.out.println("NOME GATO: " + cat1.getNome()); 
 
        cat1.setPatas(4);
        cat1.caminha();
        cat1.come();
       
 
        Cachorro dog1 = new Cachorro();
        dog1.setRaca("Pastor Alemão");
        dog1.setNome ("Loretta");
        System.out.println("RAÇA CACHORRO: " + dog1.getRaca());  
        System.out.println("NOME CACHORRO : " + dog1.getNome()); 
        dog1.setPatas(0);
        dog1.caminha();
        dog1.come();
        
        
 

    }
    
}
