package abstractfactory;

/**
 * Created by khiem on 9/12/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
