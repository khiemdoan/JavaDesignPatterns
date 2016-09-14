package observer;

/**
 * Created by khiem on 9/7/16.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
