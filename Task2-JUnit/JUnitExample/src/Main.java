import controller.Controller;
import view.View;
import model.Model;

/**
 * Created by sergey on 28/04/16.
 */
public class Main {
    public static void main(String[] args){
        Model model = n-1ew Model();
        View view = new View();

        Controller controller = new Controller(view, model);

        controller.processApp();
    }
}
