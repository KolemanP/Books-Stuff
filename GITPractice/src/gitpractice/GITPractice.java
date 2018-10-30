
package gitpractice;
import java.util.ArrayList;
/**
 *
 * @author kp0885055
 */
public class GITPractice {

    public static void main(String[] args) {
        Lion lion = new Lion(6, "orange");
        FIsh fish = new FIsh(3, "blue and gold");
        Dog dog = new Dog(11, "Black");     
        
        
        
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        aryAnimal.add(dog);
        
        for(int i =0; i < aryAnimal.size(); i++){
            allSpeak(aryAnimal.get(i));
        }
        
        

//        allSpeak(fish);
//        lionSpeak(lion);
//        fishSpeak(fish);
//        dogSpeak(dog);
//        allSpeak(animal);
        
    }
//    public static void lionSpeak(Lion lion){
//        lion.speak();
//    }
//    
//    public static void fishSpeak(FIsh fish){
//        fish.speak ();
//    }
//    
//    public static void dogSpeak(Dog dog){
//        dog.speak();
//    }
//    
    public static void allSpeak(Animal animal){
        animal.speak();
    }
}
