/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem;

/**
 *
 * @author felipe.oviedo.maltez
 */
public class Ecosystem {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        Wolf wolf = new Wolf();        
        Sheep sheep = new Sheep();    
        Sheep sheep2 = new Sheep("small", "black");
        
        
        System.out.println("Default Constructor : "+"Size: " +sheep.size + " Color: "+ sheep.getColor() );
        System.out.println("Overload Constructor : Size: " +sheep2.size + " Color: "+ sheep2.getColor());
         
        
        sheep2.size = "big";    //public data member
        sheep2.setColor("white"); //private data member
        System.out.println("Acccess Modifiers : Size: " +sheep2.size + " Color: "+ sheep2.getColor()+ "\n");
        
        System.out.println("Overriding Methods");
        animal.behavior();
        sheep.behavior();
        wolf.behavior();
        
        System.out.println("\nOverloading Method");        
        sheep.eat();
        sheep.eat("weed");
    }
    
}
