import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TinyAnimation extends Application {
    public void start(Stage stage) {
        Circle circle = new Circle(50, 0, 20); // x=50, y=100, radius=20

        // Move right by 150px in 1 second
        TranslateTransition move = new TranslateTransition(Duration.seconds(10), circle);
        move.setByX(300);
        move.play(); // start animation

        Pane root = new Pane(circle);
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Tiny Animation");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
