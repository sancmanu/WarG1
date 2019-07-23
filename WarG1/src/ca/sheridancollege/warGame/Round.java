package ca.sheridancollege.warGame;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;

public class Round
{

   private boolean isRoundStart;
   private ArrayList<WarPlayer> players;// the players of the game
   private WarGame attribute;
   /**
    * the players of the game
    */
   private War war;

   public Round ()
   {
      // TODO - implement Round.Round
      throw new UnsupportedOperationException();
   }

   /**
    *
    * @param player1
    * @param player2
    */
   public Round (Player player1, Player player2)
   {
      // TODO - implement Round.Round
      throw new UnsupportedOperationException();
   }

   public Player declareRoundWinner ()
   {
      // TODO - implement Round.declareRoundWinner
      throw new UnsupportedOperationException();
   }

   public void startWar ()
   {
      // TODO - implement Round.startWar
      throw new UnsupportedOperationException();
   }

   public void addCardsToCardDeck ()
   {
      // TODO - implement Round.addCardsToCardDeck
      throw new UnsupportedOperationException();
   }

   /**
    *
    * @param player1LastCard
    * @param player2LastCard
    */
   public void addCardsToCardDeck (PokerCard player1LastCard, PokerCard player2LastCard)
   {
      // TODO - implement Round.addCardsToCardDeck
      throw new UnsupportedOperationException();
   }

   /**
    * @return the isRoundStart
    */
   public boolean isIsRoundStart ()
   {
      return isRoundStart;
   }

   /**
    * @param isRoundStart the isRoundStart to set
    */
   public void setIsRoundStart (boolean isRoundStart)
   {
      this.isRoundStart = isRoundStart;
   }

   /**
    * @return the players
    */
   public ArrayList<WarPlayer> getPlayers ()
   {
      return players;
   }

   /**
    * @param players the players to set
    */
   public void setPlayers (ArrayList<WarPlayer> players)
   {
      this.players = players;
   }

   /**
    * @return the war
    */
   public WarGame getAttribute ()
   {
      return attribute;
   }

   /**
    * @param war the war to set
    */
   public void setAttribute (WarGame war)
   {
      this.attribute = war;
   }

   public War getWar ()
   {
      return this.war;
   }

   public void setWar (War war)
   {
      this.war = war;
   }

}
