import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SoudniMistnost {
    List<Zakon> zakonik;

    public SoudniMistnost() {
        zakonik = new ArrayList<>();
    }

    public void add(Zakon zakon){
        zakonik.add(zakon);
    }


    public void removeZakon(String name) {
        for (Zakon z : zakonik) {
            if (z.getNazev() == name) {
                zakonik.remove(z);
            }
        }
    }

    public List<Zakon> vypisZakoniku() {
        System.out.println(zakonik.size());
        return zakonik;
    }

    public void vypisZakonuPodleOboru(Obor obor) {
        ArrayList<Zakon> oboroveZakony = new ArrayList<>();
        for (Zakon z : zakonik) {
            if (z.getObor() == obor) {
                oboroveZakony.add(z);
            }
        }
        System.out.println(oboroveZakony);
    }

    public void vypisZakonuPodleSoudce(String jmeno, String prijmeni) {
        ArrayList<Zakon> zakonySoudce = new ArrayList<>();
        for (Zakon z : zakonik) {
            if (z.getSoudce().getJmeno() == jmeno && z.getSoudce().getPrijmeni() == prijmeni) {
                zakonySoudce.add(z);
            }
        }
        System.out.println(zakonySoudce);
    }

    public void serialzaceZakonu(String name) {
        Zakon zakonNaNalezeni = null;
        for (Zakon z : zakonik) {
            if (z.getNazev() == name) {
                zakonNaNalezeni = z;
            }
        }
        if (zakonNaNalezeni != null) {
            try {
                ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("Serializace.txt"));
                objectStream.writeObject(zakonNaNalezeni);


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "SoudniMistnost{" +
                "zakonik=" + zakonik +
                '}';
    }
}
