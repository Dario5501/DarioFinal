public class InvalideWc {
        public InvalideWc() {

        }

        // checkt als klant de juiste opties heeft om een locatie van wc te krijgen.
        public boolean weiger(boolean beschrikbaar, boolean betalen, boolean invalide) {
                if (beschrikbaar && (betalen || invalide)) {
                        return true;

                } else
                        return false;
        }
}
