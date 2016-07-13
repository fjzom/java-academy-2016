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
public class Sheep extends Animal {

    public String size;
    private String color;

    Sheep() {
    this.size = "undefined";
        this.color = "undefined";

    }
    
    Sheep(String size,  String color) {

        this.size = size;
        this.color = color;
    }

    Sheep(String size) {

        this.size = size;

    }

    @Override
    public void behavior() {

        System.out.println("Sheep: Paciffic");

    }

    public void eat() {

        System.out.println("undefined food");

    }

    public void eat(String food) {

        System.out.println("Sheep eat: "+food);

    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
