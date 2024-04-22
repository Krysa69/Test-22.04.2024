public class Zakon {
    private String nazev;
    private Obor obor;
    private String popis;
    private String datumAktualizace;
    private Soudce soudce;

    public Zakon(String nazev, Obor obor, String popis, String datumAktualizace, Soudce soudce) {
        this.nazev = nazev;
        this.obor = obor;
        this.popis = popis;
        this.datumAktualizace = datumAktualizace;
        this.soudce = soudce;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Obor getObor() {
        return obor;
    }

    public void setObor(Obor obor) {
        this.obor = obor;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public String getDatumAktualizace() {
        return datumAktualizace;
    }

    public void setDatumAktualizace(String datumAktualizace) {
        this.datumAktualizace = datumAktualizace;
    }

    public Soudce getSoudce() {
        return soudce;
    }

    public void setSoudce(Soudce soudce) {
        this.soudce = soudce;
    }

    @Override
    public String toString() {
        return "Zakon{" +
                "nazev='" + nazev + '\'' +
                ", obor=" + obor +
                ", popis='" + popis + '\'' +
                ", datumAktualizace='" + datumAktualizace + '\'' +
                ", soudce=" + soudce +
                '}';
    }
}
