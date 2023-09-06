import java.util.List;
import java.util.ArrayList;


public class Pojistenci {

    public List<Zaznam> zaznamy = new ArrayList<>();

    public void pridejZaznam(String jmeno, String prijmeni, int vek, int telefon)
    {
        zaznamy.add(new Zaznam(jmeno, prijmeni, vek, telefon));
    }


}
