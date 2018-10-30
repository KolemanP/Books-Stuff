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
public class NonFiction extends Books{

    public NonFiction(String title, double price) {
        super(title, price);
    }

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
    
}
