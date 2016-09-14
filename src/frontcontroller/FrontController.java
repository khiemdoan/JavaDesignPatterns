package frontcontroller;

/**
 * Created by khiem on 9/14/16.
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String requset) {
        System.out.println("Page requestd: " + requset);
    }

    public void dispatchRequest(String request) {
        // log each request
        trackRequest(request);

        // authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
