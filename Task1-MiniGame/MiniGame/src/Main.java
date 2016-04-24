import model.Model;
import view.View;
import controller.Controller;

/**
 * Created by sergey on 24/04/16.
 */
public class Main {
    public static void main(String[] args){
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(view, model);

        controller.processGame();
    }
}
