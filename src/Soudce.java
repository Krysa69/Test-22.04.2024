public class Soudce {
    private String jmeno;
    private String prijmeni;
    private Titul titul;

    public Soudce(String jmeno, String prijmeni, Titul titul) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.titul = titul;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Titul getTitul() {
        return titul;
    }

    public void setTitul(Titul titul) {
        this.titul = titul;
    }
}
