package businessdelegate;

/**
 * Created by khiem on 9/14/16.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessDelegate) {
        this.businessService = businessDelegate;
    }

    public void doTask() {
        businessService.toTask();
    }
}
