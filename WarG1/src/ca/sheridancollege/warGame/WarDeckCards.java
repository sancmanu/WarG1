package ca.sheridancollege.warGame;

import ca.sheridancollege.project.*;

/**
 * @author Manuel Sanchez Moyano - Student ID 991545555
 */
public class WarDeckCards extends GroupOfCards
{

   /**
    *
    * @param givenSize
    */
   public WarDeckCards (int givenSize)
   {
      super(givenSize);

   }

   public void createCardDeck ()
   {
      PokerCard pokerCard = new PokerCard();
      for (int i = 0; i < pokerCard.getSuit().values().length; i++) {
         for (int j = 0; j < pokerCard.getValue().values().length; j++) {
            pokerCard.setSuit(pokerCard.getSuit().values()[i]);
            pokerCard.setValue(pokerCard.getValue().values()[j]);
            this.getCards().add(pokerCard);
            System.out.println(pokerCard.toString());
         }
      }

   }
}
