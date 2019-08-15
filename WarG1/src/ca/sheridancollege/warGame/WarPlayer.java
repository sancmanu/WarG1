package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Player;

public class WarPlayer extends Player
{
   private WarDeckCards warDeckCards;

   public WarPlayer (String name)
   {
      super(name);
   }

   public WarPlayer (String name, WarDeckCards warDeckCards)
   {
      super(name);
      this.warDeckCards = warDeckCards;
   }


   public WarDeckCards getWarDeckCards ()
   {
      return warDeckCards;
   }

   public void setWarDeckCards (WarDeckCards warDeckCards)
   {
      this.warDeckCards = warDeckCards;
   }


   @Override
   public void play ()
   {
      //play randomly a card
   }
}
