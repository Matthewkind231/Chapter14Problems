/*
Write a program that displays three cards randomly selected from a deck of 52, with card images.
 */
package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class DisplayThreeRandomCards extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
         int firstRandomCardIndex = (int)(Math.random() * 53);
         int secondRandomCardIndex;
         do {
             secondRandomCardIndex = (int)(Math.random() * 53);
         } while(secondRandomCardIndex == firstRandomCardIndex);
         int thirdRandomCardIndex;
         do {
             thirdRandomCardIndex = (int)(Math.random() * 53);
         } while(thirdRandomCardIndex == firstRandomCardIndex && thirdRandomCardIndex != secondRandomCardIndex);
         Image[] cardImages = createCardList();
         GridPane pane = new GridPane();
         ImageView firstRandomCard = new ImageView(cardImages[firstRandomCardIndex]);
         ImageView secondRandomCard = new ImageView(cardImages[secondRandomCardIndex]);
         ImageView thirdRandomCard = new ImageView(cardImages[thirdRandomCardIndex]);
         pane.getChildren().addAll(firstRandomCard, secondRandomCard, thirdRandomCard);
         pane.setConstraints(firstRandomCard, 0, 0);
         pane.setConstraints(secondRandomCard, 1, 0);
         pane.setConstraints(thirdRandomCard, 2, 0);
         firstRandomCard.setFitHeight(100);
         secondRandomCard.setFitHeight(100);
         thirdRandomCard.setFitHeight(100);
         firstRandomCard.setFitWidth(100);
         secondRandomCard.setFitWidth(100);
         thirdRandomCard.setFitWidth(100);
         Scene scene = new Scene(pane, 300,100);
         primaryStage.setTitle("Random Card Shuffler");
         primaryStage.setScene(scene);
         primaryStage.show();
    }
    public Image[] createCardList() {
        Image[] cardImageList = {new Image("chapter14/PNG-cards-1.3/10_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/10_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/10_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/10_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/2_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/2_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/2_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/2_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/3_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/3_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/3_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/3_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/4_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/4_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/4_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/4_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/5_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/5_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/5_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/5_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/6_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/6_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/6_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/6_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/7_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/7_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/7_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/7_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/8_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/8_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/8_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/8_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/9_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/9_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/9_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/9_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/ace_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/ace_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/ace_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/ace_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/jack_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/jack_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/jack_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/jack_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/king_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/king_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/king_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/king_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/queen_of_spades.png"),
             new Image("chapter14/PNG-cards-1.3/queen_of_clubs.png"),
             new Image("chapter14/PNG-cards-1.3/queen_of_hearts.png"),
             new Image("chapter14/PNG-cards-1.3/queen_of_diamonds.png"),
             new Image("chapter14/PNG-cards-1.3/black_joker.png"),
             new Image("chapter14/PNG-cards-1.3/red_joker.png")};
        return cardImageList;
    } 
    
    /*
     Then have three variables containing 
    three random cards, and then select three of those cards at random, making sure that
    the successive cards aren't any of the previous cards.
    */
    
}
