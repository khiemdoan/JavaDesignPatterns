package interceptingfilter;

/**
 * Created by khiem on 9/14/16.
 */
public class AuthenticationFilter implements Filter {

    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
