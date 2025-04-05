import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CircleAndSquare extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50); // Center at (100,100), Radius = 50
        circle.setFill(Color.BLUE); // Fill color
        circle.setStroke(Color.RED); // Border color
        circle.setStrokeWidth(5);
        // Create a Square (Rectangle with equal width and height)
        Rectangle square = new Rectangle(200, 80, 100, 100); // Top-left at (200,80), Size 100x100
        square.setFill(Color.RED);
        square.setStroke(Color.BLACK);
        square.setStrokeWidth(2);
        // Add shapes to the pane
        pane.getChildren().addAll(square,circle);
        // Scene setup
        Scene scene = new Scene(pane, 400, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Circle and Square");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
