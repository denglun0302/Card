import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.Random;

public class CardGame {
    private static final String[] COLORS = {
            "♠", "♥", "♦", "♣"
    };

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println(deck);
        shu(deck);
        System.out.println(deck);
        List<List<Card>> hands = new ArrayList<>();
        send(hands, deck, 3, 5);
        System.out.println(hands.get(0));
        System.out.println(hands.get(1));
        System.out.println(hands.get(2));
        System.out.println(deck);
        play(hands);
    }

    private static List<Card> buyDeck() {
        List<Card> deck = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                String color = COLORS[i];
                Card card = new Card(j, color);
                deck.add(card);
            }

        }
        return deck;
    }

    private static void shu(List<Card> deck) {
        Random random = new Random(456123);
        for (int i = deck.size() - 1; i > 0; i--) {
            int r = random.nextInt(i);
            swap(deck, r, i);
        }
    }

    private static void send(List<List<Card>> hands, List<Card> deck, int num, int numPeople) {
        for (int k = 0; k < numPeople; k++) {
            hands.add(new ArrayList<>());
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < numPeople; j++) {
                Card card = deck.remove(0);
                hands.get(j).add(card);
            }
        }
    }


    private static void swap(List<Card> deck, int i, int j) {
        Card t = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, t);
    }

    private static void play(List<List<Card>> hands) {
        Card card = new Card(2, "♠");
        for (int i = 0; i < hands.size(); i++) {
            if (hands.get(i).contains(card)) {
                System.out.println("%d 输了");
                return;
            }



        }

    }
}


