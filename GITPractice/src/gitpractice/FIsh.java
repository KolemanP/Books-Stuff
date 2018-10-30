/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpractice;

/**
 *
 * @author kp0885055
 */
public class FIsh extends Animal{

    public FIsh(int age, String color) {
        super(age, color);
    }
    @Override
    public void speak(){
        System.out.println("I bubble");
    }
    
}
