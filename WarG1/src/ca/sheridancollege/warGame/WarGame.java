package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Game;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;

public class WarGame extends Game
{
   private WarDeckCards deckOfCards;

   public WarGame (String givenName)
   {
      super(givenName);
      this.deckOfCards = new WarDeckCards(52);
   }

   public void deal ()
   {

   }

   @Override
   public void play ()
   {
      boolean exitFlag = false;

      do {

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
      ArrayList<Player> playerList = new ArrayList<>();
      playerList.add(new WarPlayer("1"));
      playerList.add(new WarPlayer("2"));
      game.setPlayers(playerList);
      game.play();

   }
}
