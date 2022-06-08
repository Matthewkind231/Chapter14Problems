/*
Write a program that displays four images in a grid pane.
 */
package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class DisplayImages  extends Application{
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        ImageView image1 = new ImageView("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/2560px-Flag_of_the_United_States.svg.png");
        image1.setFitHeight(100);
        image1.setFitWidth(100);
        ImageView image2 = new ImageView("https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png");
        image2.setFitHeight(100);
        image2.setFitWidth(100);
        ImageView image3 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png");
        image3.setFitHeight(100);
        image3.setFitWidth(100);
        ImageView image4 = new ImageView("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1280px-Flag_of_Russia.svg.png");
        image4.setFitHeight(100);
        image4.setFitWidth(100);
        pane.getChildren().addAll(image1,image2,image3,image4);
        pane.setConstraints(image1, 0, 0);
        pane.setConstraints(image2, 1, 0);
        pane.setConstraints(image3, 2, 0);
        pane.setConstraints(image4, 3, 0);
        Scene scene = new Scene(pane, 400,100);
        primaryStage.setTitle("DisplayImages");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
