package nullobject;

/**
 * Created by khiem on 9/7/16.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isNil() {
        return false;
    }
}
