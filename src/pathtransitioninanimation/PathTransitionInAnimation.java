package pathtransitioninanimation;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.util.Duration;

/**
 *
 * @author guillermogallegogonzalez
 */
public class PathTransitionInAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle rectangulo = new Rectangle(0, 0, 20, 40);
        rectangulo.setFill(Color.ORANGE);
        Circle circulo = new Circle(125, 100, 50);
        circulo.setFill(Color.WHITE);
        circulo.setStroke(Color.BLACK);
        pane.getChildren().addAll(circulo, rectangulo);
        
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(circulo);
        pathTransition.setNode(rectangulo);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play(); 
        
        Scene scene = new Scene(pane, 250, 210); 
        primaryStage.setTitle("PathTransition"); 
        primaryStage.setScene(scene); 
        primaryStage.show();
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
