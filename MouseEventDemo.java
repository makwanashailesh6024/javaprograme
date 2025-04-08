import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Rectangle to attach mouse events to
        Rectangle rect = new Rectangle(200, 150, Color.CORNFLOWERBLUE);
        rect.setArcHeight(20);
        rect.setArcWidth(20);

        // TextArea to show events
        TextArea eventLog = new TextArea();
        eventLog.setEditable(false);
        eventLog.setPrefRowCount(10);

        // Attach all mouse events to the rectangle
        rect.setOnMouseClicked(e -> logEvent("Mouse Clicked", e, eventLog));
        rect.setOnMousePressed(e -> logEvent("Mouse Pressed", e, eventLog));
        rect.setOnMouseReleased(e -> logEvent("Mouse Released", e, eventLog));
        rect.setOnMouseMoved(e -> logEvent("Mouse Moved", e, eventLog));
        rect.setOnMouseDragged(e -> logEvent("Mouse Dragged", e, eventLog));
        rect.setOnMouseEntered(e -> logEvent("Mouse Entered", e, eventLog));
        rect.setOnMouseExited(e -> logEvent("Mouse Exited", e, eventLog));

        // Layout
        BorderPane root = new BorderPane();
        root.setCenter(rect);
        root.setBottom(eventLog);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX Mouse Event Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void logEvent(String eventName, MouseEvent e, TextArea log) {
        String message = String.format("%s at (%.0f, %.0f)%n", eventName, e.getX(), e.getY());
        System.out.print(message);
        log.appendText(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
