public class Card {
    int val;
    String color;

    public Card(int val, String color) {
        this.val = val;
        this.color = color;
    }

    @Override
    public String toString() {
        String h;
        if (val == 1) {
            h = "A";
        }
        if (val == 11) {
            h = "J";
        }
        if (val == 12) {
            h = "Q";
        }
        if (val == 13) {
            h = "K";

        }
        else {
            h = String.valueOf(val);
        }
        return String.format("[%s %s]", color, h);
    }
}


