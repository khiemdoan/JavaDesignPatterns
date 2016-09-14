package abstractfactory;

/**
 * Created by khiem on 9/12/16.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
