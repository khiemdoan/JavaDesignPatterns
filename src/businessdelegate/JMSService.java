package businessdelegate;

/**
 * Created by khiem on 9/14/16.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
