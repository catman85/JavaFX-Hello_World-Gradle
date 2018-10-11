package helloworld;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Danny Althoff
 */
public class MainClass extends javafx.application.Application {

    public static void main(String[] args) {
        MainClass.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // here you can do your normal JavaFX magic ;)
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("School");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        System.out.println("Success!");
//        System.exit(0);
    }
}
