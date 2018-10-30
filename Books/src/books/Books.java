/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author kp0885055
 */
public abstract class Books {
    String title;
    double price;
    
    public Books(String title, double price ){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract void setPrice();
    
    
}
