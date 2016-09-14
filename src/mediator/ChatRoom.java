package mediator;

import java.util.Date;

/**
 * Created by khiem on 9/5/16.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
