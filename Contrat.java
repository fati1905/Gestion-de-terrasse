import java.util.ArrayList;
import java.util.Date;

public class Contrat {
    private String titulaire;
    private Date dateDebut;
    private Date dateFin;
    private float montantAPayer;
    private ArrayList<Tarif> tarifs;


    public Contrat(String titulaire, Date dateDebut, Date dateFin, float montantAPayer) {
        this.titulaire = titulaire;
        this.dateDebut = dateDebut;
        this.dateFin =dateFin;
        this.montantAPayer = montantAPayer;
        tarifs = new ArrayList<>();
    }

    public String getTitulaire() {
        return titulaire;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public float getMontantAPayer() {
        return montantAPayer;
    }

    public void setDateFin(Date dateFin) {
        if (dateFin.after(dateDebut))
            this.dateFin = dateFin;
    }

    public void setMontantAPayer(float montantAPayer) {
        if (montantAPayer >= 0)
            this.montantAPayer = montantAPayer;
    }

    public void ajouterTarif(float prix) {
        if (prix >= 0)
            tarifs.add(new Tarif(prix));
    }

    public void retirerTarif(Tarif tarif) {
        if (tarif != null)
            tarifs.remove(tarif);
    }

    public String toString() {
        return "(" + titulaire + ")" + dateDebut + " a " +  dateFin + ", Montant a payer : " + montantAPayer + "€, tarifs : " + tarifs;
    }
}
