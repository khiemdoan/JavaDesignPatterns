package strategy;

/**
 * Created by khiem on 9/7/16.
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
