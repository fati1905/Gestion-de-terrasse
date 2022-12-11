import java.util.HashMap;
import java.util.Scanner;

public class Etablissement {
    private String nomCommercial;
    private String adresse;
    private HashMap<Integer, Terrasse> terrasses;
    ListDemandeTerrasse listDemandeTerrasse = new ListDemandeTerrasse();

    public Etablissement() {
        System.out.println("****** Votre Établissement ****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom commercial de votre entreprise :");
        this.nomCommercial = sc.nextLine();
        System.out.println("Entrer l'adresse de votre entreprise :");
        this.adresse = sc.nextLine();
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etablissement{" +
                "nomCommercial='" + nomCommercial + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public void ajouterTerrasse(Terrasse terrasse) {
        if (terrasse != null)
            terrasses.put(terrasse.getCode(), terrasse);
    }

    public void retirerTerrasse(Terrasse terrasse) {
        if (terrasse != null && terrasses.size() > 0)
            try {
                terrasses.remove(terrasse.getCode());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
    }
    public void mesDemandeDeTerrasse(Account c){

        for (var entry: listDemandeTerrasse.listDemandeTerrasse.entrySet()) {
            if (entry.getValue().etablissement.equals(this)){
                System.out.println(entry.getValue());
            }
        }

    }
}
