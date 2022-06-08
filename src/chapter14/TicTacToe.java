/*
Write a program that displays a tic-tac-toe board.
 */
package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class TicTacToe extends Application {
    @Override
     public void start(Stage primaryStage) {
         GridPane pane = new GridPane();
         for(int i = 0; i < 3; i++) {
             for(int j = 0; j < 3; j++) {
                 int random = (int)(Math.random() * 2);
                 if(random == 0) {
                     ImageView x = new ImageView("chapter14/X.png");
                     pane.getChildren().add(x);
                     pane.setConstraints(x, i, j);
                 }
                 else {
                     ImageView o = new ImageView("chapter14/O.png");
                     pane.getChildren().add(o);
                     pane.setConstraints(o, i, j);
                 }
             }
         }
         Scene scene = new Scene(pane, 600,550);
         primaryStage.setTitle("Tic-Tac-Toe");
         primaryStage.setScene(scene);
         primaryStage.show();
     }
     public static void main(String[] args) {
         Application.launch(args);
     }
}
