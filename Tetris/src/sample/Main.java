package sample;

import com.sun.javafx.geom.Vec2d;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static int width = 400;
    public static int height = 600;

    public ArrayList<Node> shapes = new ArrayList<Node>();

    @Override
    public void start(Stage stage) throws Exception {
        Rectangle background = new Rectangle(0, 0, width, height);
        background.setFill(Color.BLACK);
        shapes.add(background);

        Group group = new Group(shapes);
        Scene scene = new Scene(group, width, height);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
