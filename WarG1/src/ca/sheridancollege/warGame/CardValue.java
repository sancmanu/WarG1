package ca.sheridancollege.warGame;

public enum CardValue
{
   A(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
   EIGHT(8), NINE(9), TEN(10), J(11), Q(12), K(13);

   private final int cardValues;

   private CardValue (int cardValues)
   {
      this.cardValues = cardValues;
   }

   /**
    * @return the cardValues
    */
   public int getValue ()
   {
      return cardValues;
   }



}
