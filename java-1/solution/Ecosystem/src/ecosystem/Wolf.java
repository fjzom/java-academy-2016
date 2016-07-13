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
public class Wolf extends Animal {

    public String size;
    private String color;

    Wolf() {
        this.size = "undefined";
        this.color = "undefined";

    }

    Wolf(String size, String color) {

        this.size = size;
        this.color = color;
    }

    Wolf(String size) {

        this.size = size;

    }

    @Override
    public void behavior() {

        System.out.println("Wolf: Agressive");

    }

    public void eat() {

        System.out.print("undefined food");

    }

    public void eat(String food) {

        System.out.print("Wolf eat: "+food);

    }
}
