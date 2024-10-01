import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Suit suit1 = Suit.DIAMONDS;

        PlayingCardE card1 = new PlayingCardE(Suit.CLUBS, "валет");
        System.out.println("card1 = " + card1);
        PlayingCardE card2 = new PlayingCardE(Suit.valueOf("SPADES"), "валет");
        System.out.println("card2 = " + card2);

        List<PlayingCardE> cardEList = new ArrayList<>();
        cardEList.add(card1);
        cardEList.add(card2);
        cardEList.add(new PlayingCardE(Suit.HEARTS, "9"));
        cardEList.add(new PlayingCardE(Suit.SPADES, "10"));
        System.out.println("cardEList = " + cardEList);

        cardEList.sort(Comparator.comparing(c -> c.suit));
        System.out.println("cardEList = " + cardEList);
    }
}

enum Suit{
    SPADES, CLUBS, HEARTS,  DIAMONDS;

    @Override
    public String toString() {
        switch (this.ordinal()){
            case 1: return "трефы";
            case 2: return "червы";
            case 0: return "пики";
            case 3: return "бубны";
            default: return "some suit";
        }
    }
}

class PlayingCardE {
    Suit suit;
    String rank;

    public PlayingCardE(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "PlayngCardE{" +
                "suit=" + suit +
                ", rank='" + rank + '\'' +
                '}';
    }
}


