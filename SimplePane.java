import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimplePane extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Pane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
