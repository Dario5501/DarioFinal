public class Prijs {

    public Prijs() {

    }

    // berekent prijs dat een klant moet betalen.
    public double PrijsBerekenen(boolean contant, boolean invalide, boolean pin, int afstand) {
        if (afstand >= 0 && afstand < 3) {
            if (invalide) {
                return 0.0;
            } else if (contant || pin) {
                return 1.0;
            }
        }
            if (afstand >= 3 && afstand < 6) {
                if (invalide) {
                    return 0.0;
                } else if (contant || pin) {
                    return 0.75;
                }
            }
            if (afstand >= 6) {
                if (invalide) {
                    return 0.0;
                } else if (contant || pin) {
                    return 0.5;
                }
        }
        return 0.0;
        }
    }

