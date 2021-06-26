public class Aftand {

// deze methode verteld hoe ver een wc is aan de hand van gegeven km.
    public String getAfstand(double afstand) {
        if (afstand >= 0 && afstand < 3) {
            return  "wc is dichtbij";
        } else if (afstand >=3 && afstand < 6) {
            return "wc is verder weg";
        } else if (afstand >=6) {
            return "wc is ver weg";
        }
        return "";
    }
}
