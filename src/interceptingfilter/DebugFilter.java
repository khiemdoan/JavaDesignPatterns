package interceptingfilter;

/**
 * Created by khiem on 9/14/16.
 */
public class DebugFilter implements Filter {

    public void execute(String request) {
        System.out.println("Request log: " + request);
    }
}
