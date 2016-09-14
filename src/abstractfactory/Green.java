package abstractfactory;

/**
 * Created by khiem on 9/12/16.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
