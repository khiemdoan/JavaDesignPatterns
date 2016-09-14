package visitor;

/**
 * Created by khiem on 9/13/16.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
