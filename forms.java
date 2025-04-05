import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class forms extends Application {
    
    @Override
    public void start(Stage stage) {
        // Create controls
        TextField nameField = new TextField();
        nameField.setPromptText("Your name");
        
        TextArea noteArea = new TextArea();
        noteArea.setPromptText("Your notes");
        noteArea.setMaxHeight(100);
        
        ToggleGroup group = new ToggleGroup();
        RadioButton opt1 = new RadioButton("Option 1");
        RadioButton opt2 = new RadioButton("Option 2");
        opt1.setToggleGroup(group);
        opt2.setToggleGroup(group);
        
        Button submit = new Button("Submit");
        // Layout
        VBox root = new VBox(10, nameField, noteArea, opt1, opt2, submit);
        // Show window
        stage.setScene(new Scene(root, 250, 250));
        stage.setTitle("Mini Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}