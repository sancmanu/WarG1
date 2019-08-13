package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Player;

public class WarPlayer extends Player
{
   private WarDeckCards warDeckCards;

   public WarPlayer (String name)
   {
      super(name);
      this.warDeckCards = new WarDeckCards(26);
   }

   @Override
   public void play ()
   {
      //play randomly a card
   }
}
