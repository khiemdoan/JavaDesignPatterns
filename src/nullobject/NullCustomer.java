package nullobject;

/**
 * Created by khiem on 9/7/16.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available is Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
