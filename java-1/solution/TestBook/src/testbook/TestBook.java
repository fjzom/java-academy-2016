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
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //COMPOSITION data member in book & magazine
        Author bookAuthor = new Author();
        Author magazAuthor = new Author();

        //magazine INHERITANCE form book
        Book book = new Book();
        Magazine magazine = new Magazine();

        //setting book and magazine objs
        bookAuthor.setName("Buxmann");
        magazAuthor.setName("App Org");

        book.setID(1234);
        book.setName("The Software Industry");
        book.setAuthor(bookAuthor);

        magazine.setID(0002);
        magazine.setName("CoSci News");
        magazine.setAuthor(magazAuthor);

        //protected methods book & magazine
        book.addBook(book);
        magazine.addMagazine(magazine);

        System.out.println("");

        //POLYMORPHISM 
        Book m = new Magazine();
        m.description();
        book.description();
        magazine.description();

        //INTERFACE
        IStoreBookMagazine b = new Book();
        b.whareHouse();

    }

}
