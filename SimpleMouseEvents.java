import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;

public class SimpleMouseEvents extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle rect = new Rectangle(200, 100, 50,100);

        rect.setOnMouseClicked(e -> System.out.println("Mouse Clicked"));
        rect.setOnMousePressed(e -> System.out.println("Mouse Pressed"));
        rect.setOnMouseReleased(e -> System.out.println("Mouse Released"));
        rect.setOnMouseEntered(e -> System.out.println("Mouse Entered"));
        rect.setOnMouseExited(e -> System.out.println("Mouse Exited"));
        rect.setOnMouseMoved(e -> System.out.println("Mouse Moved"));
        rect.setOnMouseDragged(e -> System.out.println("Mouse Dragged"));

        Pane root = new Pane(rect);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Mouse Events Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
