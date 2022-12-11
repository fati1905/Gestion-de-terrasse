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
    Etablissement etablissement;
    Person person;

    public DemandeTerrasse(Account c){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer adresse de terrasse :");
        this.adresse = sc.nextLine();
        System.out.println("Entrer Largeur du terrasse :");
        int s = sc.nextInt();
        System.out.println("Entrer la hauteur du terrasse :");
        int s1 = sc.nextInt();
        this.dimension = new Dimension();
        date = Calendar.getInstance();
        this.etablissement = new Etablissement();

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

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public Person getPerson() {
        return person;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    void redigerRapport(Account c){
        Role r = new Role(roleP.surveillant);

        if(c.getRoles().contains(r)){
            System.out.println("Rédiger votre rapport :");
            Scanner sc = new Scanner(System.in);

            this.rapport = sc.nextLine();
        }else {
            System.out.println("Vous n'avez pas le droit de rédiger le raaport.");
        }
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
                ", date=" + date +
                ", etablissement=" + etablissement +
                ", person=" + person +
                '}';
    }
}

