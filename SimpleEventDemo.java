import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        Label message = new Label("Press the button or any key");
        Button btn = new Button("Click Me!");
        Label counter = new Label("Clicks: 0");
        Label keyInfo = new Label("Last key pressed: ");
        
        // Button click counter
        final int[] clickCount = {0};
        
        // Button event handler
        btn.setOnAction(event -> {
            clickCount[0]++;
            counter.setText("Clicks: " + clickCount[0]);
            message.setText("Button was clicked!");
        });
        
        // Create layout
        VBox root = new VBox(20, message, btn, counter, keyInfo);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        
        // Create scene and setup keyboard events
        Scene scene = new Scene(root, 300, 200);
        
        scene.setOnKeyPressed(event -> {
            message.setText("Key pressed: " + event.getCode());
            keyInfo.setText("Last key pressed: " + event.getCode());
        });
        
        // Set up the stage
        primaryStage.setTitle("Simple Event Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}