import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIControlsExample extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        
        TextArea textArea = new TextArea("Type here...");
             textArea.setPrefSize(300, 100);
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Hello, " + textField.getText()));

        VBox layout = new VBox(10, label,textField, textArea,button);
        Scene scene = new Scene(layout, 300, 200);

        stage.setScene(scene);
        stage.setTitle("JavaFX UI Controls");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
