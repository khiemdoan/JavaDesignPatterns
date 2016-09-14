package abstractfactory;

/**
 * Created by khiem on 9/12/16.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
