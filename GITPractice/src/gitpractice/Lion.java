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
public class Lion extends Animal{

    public Lion(int age, String color) {
        super(age, color);
    }
    @Override
    public void speak(){
        System.out.println("I ROAR");
    }
    
}
