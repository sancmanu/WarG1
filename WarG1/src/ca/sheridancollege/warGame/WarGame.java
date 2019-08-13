package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Game;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;

public class WarGame extends Game
{
   private WarDeckCards warDeckOfCards;
   private ArrayList<Player> playerList;

   public WarGame (String givenName)
   {
      super(givenName);
      this.warDeckOfCards = new WarDeckCards(52);
      playerList = new ArrayList<Player>();
      playerList.add(new WarPlayer("1"));
      playerList.add(new WarPlayer("2"));
   }


   public void deal ()
   {

   }

   @Override
   public void play ()
   {
      //Create 2 player
      //Every Player has a Group of PokerCard
      //Randomly deal the warDeckOfCards (26 per each)
      boolean exitFlag = false;

      do {
         //Create a Round
         //Pass the players to round class
         //Start the Round
         //Check for a winner (declareRoundWinner)
         //Start a war (Round Class)
         //Change the amount of cards of each player
      }
      while (exitFlag != true);
   }

   @Override
   public void declareWinner ()
   {

   }

   public static void main (String[] args)
   {
      WarGame game = new WarGame("WarCardGame");
      game.play();
   }
}
