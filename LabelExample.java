import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LabelExample extends Application {
    @Override
    public void start(Stage stage) {
        Label label1 = new Label("This is a simple label.");
        Label label2 = new Label("Labels can display text.");
         Button button = new Button("Click Me");
         CheckBox checkBox = new CheckBox("Enable feature");
       RadioButton radio1 = new RadioButton("Option 1");
        RadioButton radio2 = new RadioButton("Option 2");
           ToggleGroup group = new ToggleGroup();
           radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);
         TextField textField = new TextField();
           textField.setPromptText("Type here..."); // Placeholder text
        VBox layout = new VBox(10, label1, label2,button,checkBox,radio1,radio2,textField);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Label Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
