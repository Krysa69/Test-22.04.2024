import java.util.*;
import java.io.*;

public class Soubor {
    public Soubor() {
        zamestnanci = new ArrayList<>();
    }

    private List<Zamestnanec> zamestnanci;

    public void loadFile() {
        try (BufferedReader bf = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) {
                    throw new IllegalArgumentException("Invalid data format in data.csv");
                }
                zamestnanci.add(new Zamestnanec(data[0], data[1], data[2], data[3], data[4]));
            }
            zamestnanci.remove(zamestnanci.get(1));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("data.csv file not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading data.csv file", e);
        }
    }

    public void file() {
        int pocet = 0;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("osoby_telefon.txt"));
            for (Zamestnanec z : zamestnanci) {
                if (z.getPhoneNumber().endsWith("1230")) {
                    bw.write(z.getId());
                    bw.write(z.getFirst_name());
                    bw.write(z.getLast_name());
                    bw.write(z.getEmail());
                    bw.write(z.getPhoneNumber());
                    bw.newLine();
                    pocet++;
                }
            }
            System.out.println("Počet osob v souboru je " + zamestnanci.size() + " " + pocet);
            System.out.println("Pod číslem 588 se nachází" + zamestnanci.get(587));
            System.out.println("V souboru je " + pocet + " lidí kterých telefoní číslo končí na 1230");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
