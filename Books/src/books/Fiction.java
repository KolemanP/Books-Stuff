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
public class Fiction extends Books{

    public Fiction(String title, double price) {
        super(title, price);
    }

    @Override
    public void setPrice() {
        this.price = 24.99;
    }
    
}
