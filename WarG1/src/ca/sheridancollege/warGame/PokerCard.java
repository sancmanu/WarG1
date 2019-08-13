package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Card;

public class PokerCard extends Card
{
   private Suits suite;
   private CardValue cardValue;

   public PokerCard ()
   {
   }

   public PokerCard (Suits suite, CardValue cardValue)
   {
      this.suite = suite;
      this.cardValue = cardValue;
   }

   @Override
   public String toString ()
   {
      return new String();
   }
}
