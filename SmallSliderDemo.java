import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SmallSliderDemo extends Application {
    @Override
    public void start(Stage stage) {
        Slider slider = new Slider(0, 100, 50); // min, max, initial
        Label label = new Label("Value: 50");

        slider.valueProperty().addListener((obs, oldVal, newVal) ->
            label.setText("Value: " + newVal.intValue())
        );

        VBox root = new VBox(10, slider, label);
        Scene scene = new Scene(root, 250, 100);

        stage.setScene(scene);
        stage.setTitle("Slider Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
