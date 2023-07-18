package tpractice.toop.task4test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// What we're gonna test
import practice.oop.task4.PlayingCard;

class SolutionTask {
    PlayingCard firstCard;
    PlayingCard secondCard;

    @Test
    void seeCardPower(){
        firstCard = new PlayingCard((byte) 6, (byte) 3);
        assertEquals(firstCard.getRatedPower(), (byte) 6);
    }

    @Test
    void seeCardSuit(){
        firstCard = new PlayingCard((byte) 10, (byte) 3);
        assertEquals(firstCard.getCardSuit(), "Пика");
    }

    @Test
    void compareCardPower(){
        firstCard = new PlayingCard((byte) 6, (byte) 3);
        secondCard = new PlayingCard((byte) 12, (byte) 2);

    }
}



Logger logger = Logger.getLogger("output");
    PlayingCard card1 = new PlayingCard((byte) (6), (byte) (3));
    PlayingCard card2 = new PlayingCard((byte) (9), (byte) (8));
    logger.log(
        Level.INFO,
        PlayingCard.compareCardPower(
            card1.getRatedPower(),
            card2.getRatedPower()
        )
    );
    logger.log(
        Level.INFO,
        PlayingCard.compareCardSuit(
            card1.getCardSuit(),
            card2.getCardSuit()
        )
    );
    logger.log(
        Level.INFO,
        PlayingCard.compareCards(card1, card2)
    );