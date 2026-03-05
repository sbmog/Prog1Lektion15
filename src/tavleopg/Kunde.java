package tavleopg;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String adresse;
    ArrayList<Konto> konti = new ArrayList<>();

    public Kunde(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return "Kunde{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", konti=" + konti +
                '}';
    }
    public void printKontiList(){
        for (Konto konto : konti) {
            konto.toString();
        }
    }
}
