import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class SmallListViewExample extends Application {
    @Override
    public void start(Stage stage) {
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("One", "Two", "Three");

        listView.setOnMouseClicked(e -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            System.out.println("You selected: " + selected);
        });

        Scene scene = new Scene(listView, 200, 150);
        stage.setScene(scene);
        stage.setTitle("Small ListView");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
