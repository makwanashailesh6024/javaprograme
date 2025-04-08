import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class VideoPlayer extends Application {
    @Override
    public void start(Stage stage) {
        // Replace with the path to your video file
        String path = "file:///C:/videos/sample.mp4"; // Use absolute path with 'file:///'
        Media media = new Media(path);
        MediaPlayer player = new MediaPlayer(media);
        MediaView mediaView = new MediaView(player);

        StackPane root = new StackPane(mediaView);
        Scene scene = new Scene(root, 640, 480);

        stage.setTitle("JavaFX Video Player");
        stage.setScene(scene);
        stage.show();

        player.play(); // auto-play
    }

    public static void main(String[] args) {
        launch(args);
    }
}
