package template;

/**
 * Created by khiem on 9/13/16.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play() {

        // initilize the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
