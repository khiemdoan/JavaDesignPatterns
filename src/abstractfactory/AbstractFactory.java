package abstractfactory;

/**
 * Created by khiem on 9/12/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
