package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Game;
import ca.sheridancollege.project.GroupOfCards;

public class WarGame extends Game
{

   private GroupOfCards deckOfCards;

   public WarGame (String givenName)
   {
      super(givenName);
   }

   public void deal ()
   {
      // TODO - implement WarGame.deal
      throw new UnsupportedOperationException();
   }

   @Override
   public void play ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void declareWinner ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

}
