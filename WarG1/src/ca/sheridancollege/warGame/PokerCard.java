package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Card;

public class PokerCard extends Card
{
   private Suits suite;
   private CardValue value;

   public void setSuite (Suits suite)
   {
      this.suite = suite;
   }

   public PokerCard ()
   {
      // TODO - implement PokerCard.PokerCard
      throw new UnsupportedOperationException();
   }

   @Override
   public String toString ()
   {
      return new String();
   }
}
