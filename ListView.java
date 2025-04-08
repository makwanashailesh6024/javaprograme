import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Apple", "Banana", "Mango", "Orange");

        // Optional: Handle item selection
        listView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            System.out.println("Selected: " + newVal);
        });

        StackPane root = new StackPane(listView);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
