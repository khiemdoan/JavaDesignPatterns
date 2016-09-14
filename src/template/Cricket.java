package template;

/**
 * Created by khiem on 9/13/16.
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Criket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
