import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
public class ImageExample extends Application {
    @Override
    public void start(Stage stage) {
           Pane pane = new Pane();
        // Load an image (Ensure the image file is in the correct location)
        Image image = new Image("file:E:\\payal pc//Forampic.jpg"); // Load from file
        // Image image = new Image("https://example.com/image.jpg"); // Load from URL
        // Create an ImageView to display the image
        ImageView imageView = new ImageView(image);
        // Optional: Adjust image size
        imageView.setFitWidth(300); // Set width
        imageView.setFitHeight(200); // Set height
        imageView.setPreserveRatio(true); // Maintain aspect ratio
        // Create a layout and add ImageView
  pane.getChildren().addAll(imageView);
    
        // Set up the stage
        Scene scene = new Scene(pane, 400, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Circle and Square");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
