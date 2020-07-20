package View.ViewTset;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Test_01 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane pane = new AnchorPane();

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);
        primaryStage.setScene(scene);

        root.getChildren().add(pane);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {

        super.init();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
