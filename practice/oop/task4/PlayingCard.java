package practice.oop.task4;

import java.util.logging.Logger;
import java.util.logging.Level;

public class PlayingCard {
    private final byte ratedPower;
    private final String cardSuit;

    public PlayingCard(byte ratedPower, byte cardSuit) {
        byte max = 13;
        byte min = 1;
        byte range = (byte) (max - min + 1);
        byte randomPowerWithinAcceptableRange = (byte) ((Math.random() * range) + min);
        boolean powerIsOutsideAcceptableRange = ratedPower < min && ratedPower > max;

        if (powerIsOutsideAcceptableRange) { this.ratedPower = randomPowerWithinAcceptableRange; }
        else { this.ratedPower = ratedPower; }
        this.cardSuit = suitType(cardSuit);
    }

    public byte getRatedPower(){ return ratedPower; }
    public String getCardSuit(){ return cardSuit; }

    public static String compareCardPower(byte firstCardPower, byte secondCardPower) {
        if (firstCardPower > secondCardPower) {
            return String.format("Первая карта сильнее, потому что %d больше %d.%n", firstCardPower, secondCardPower);
        }
        if (firstCardPower < secondCardPower) {
            return String.format("Вторая карта сильнее, потому что %d меньше %d.%n", firstCardPower, secondCardPower);
        }
        return "Карты по силе равны.\n";
    }

    public static String compareCardSuit(String firstCardSuit, String secondCardSuit) {
        return String.format("Первая карта имеет масть %s, вторая - %s%n", firstCardSuit, secondCardSuit);
    }

    public static String compareCards(PlayingCard first, PlayingCard second) {
        return String.format(
            compareCardPower(
                first.getRatedPower(),
                second.getRatedPower()
            ),
            compareCardSuit(
                first.getCardSuit(),
                second.getCardSuit()
            )
        );
    }

    private static String suitType(byte cardSuit) {
        switch (cardSuit) {
            case 1:
                return "Бубен";
            case 2:
                return "Черва";
            case 3:
                return "Пика";
            case 4:
                return "Треф";
            default:
                Logger.getLogger("output").log(Level.WARNING, "Введённое значение не соответсвует ни одной из известных мастей.\n Масть карты будет определена случайным образом.\n");
                byte max = 4;
                byte min = 1;
                byte range = (byte) (max - min + 1);
                cardSuit = (byte) ((Math.random() * range) + min);
                return suitType(cardSuit);
        }
    }
}

    