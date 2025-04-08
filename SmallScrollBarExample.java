import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SmallScrollBarExample extends Application {
    @Override
    public void start(Stage stage) {
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(50);

        Label label = new Label("Value: 50");

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            label.setText("Value: " + newVal.intValue());
        });

        VBox root = new VBox(10, scrollBar, label);
        root.setStyle("-fx-padding: 20px;");
        Scene scene = new Scene(root, 250, 100);

        stage.setTitle("Small ScrollBar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
