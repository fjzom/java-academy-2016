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
public class Book implements IStoreBookMagazine {
    
    private int ID;
    private String name;
    private Author author = new Author(); 
    
    public void description(){
        System.out.println("This is a BOOK.");
    }
    
    protected void addBook(Book book){
    
        System.out.println("\n\nBook: "+book.name+"\nAuthor: "+book.author.getName()+" \nSuccess Added ID "+ book.ID);
    }
    
    /*
    public Book findByID(int id, Book[] arrayBook){
        Book bookObj = new Book();
         
        bookObj = arrayBook.
        return;
        
    }
    
    public Book findAuthor(){
     
        
    }
*/
    
    
    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void whareHouse() {
       System.out.println("\nBook Sold");
    }
}
