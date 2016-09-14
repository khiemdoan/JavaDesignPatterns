package interceptingfilter;

/**
 * Created by khiem on 9/14/16.
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
