public class Zaznam {

        public String jmeno;
        public String prijmeni;
        public int vek;
        public int telefon;

        public Zaznam(String jmeno, String prijmeni, int vek, int telefon)
        {
            this.jmeno = jmeno;
            this.prijmeni = prijmeni;
            this.vek = vek;
            this.telefon = telefon;
        }

        @Override
        public String toString() {
            return jmeno + " "  +prijmeni + ", má " + vek + " let a tel.: " + telefon;
        }
}
