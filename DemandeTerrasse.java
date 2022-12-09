import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

enum etatD {
    prete,
    nonRecevable,
    attente,
    enCours,
    refuse,
    satisfaite,
    sansSuite
}
public class DemandeTerrasse {
    private etatD etat;
    private String rapport;
    private String adresse;
    private Dimension dimension;
    Calendar date;

    public DemandeTerrasse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer adresse de terrasse :");
        String ad = sc.nextLine();
        this.adresse = ad;
        System.out.println("Entrer adresse dimensions Largeur:");
        int s = sc.nextInt();
        System.out.println("Entrer adresse dimensions hauteur:");
        int s1 = sc.nextInt();
        this.dimension = new Dimension();
        date = Calendar.getInstance();
    }

    public etatD getEtat() {
        return etat;
    }

    public String getRapport() {
        return rapport;
    }

    public String getAdresse() {
        return adresse;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setEtat(etatD etat) {
        this.etat = etat;
    }

    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    void redigerRapport(){
        System.out.println("Rédiger votre rapport :");
        Scanner sc = new Scanner(System.in);

        this.rapport = sc.nextLine();
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DemandeTerrasse{" +
                "etat=" + etat +
                ", rapport='" + rapport + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
