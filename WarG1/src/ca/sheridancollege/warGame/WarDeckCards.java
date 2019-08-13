package ca.sheridancollege.warGame;
import ca.sheridancollege.project.GroupOfCards;
/**
 * @author Manuel Sanchez Moyano - Student ID 991545555
 */
public class WarDeckCards extends GroupOfCards
{
   public WarDeckCards (int givenSize)
   {
      super(givenSize);
      createCardDeck();
   }

   private void createCardDeck ()
   {
      int totalCards = getSize();
      for (int card = 0; card <= totalCards; card++) {
         for (int suite = 0; suite <= 4; suite++) {

         }
      }
   }
}
