/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbook;

/**
 *
 * @author felipe.oviedo.maltez
 */
public class Magazine extends Book {
    
    private String pictures;    
    
    @Override
    public void description() {
        System.out.println("This is a MAGAZINE.");
    }
    
    protected void addMagazine(Magazine magazine) {
        
        System.out.println("\n\nMagazine: " + magazine.getName() + "\nAuthor: " + magazine.getAuthor().getName() + " \nSuccess Added ID " + magazine.getID());
    }
    
    public void whareHouse(Magazine magazine) {
        System.out.println(magazine.getName() + "Available");
    }

    /**
     * @return the pictures
     */
    public String getPictures() {
        return pictures;
    }

    /**
     * @param pictures the pictures to set
     */
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
    
}
