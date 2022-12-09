import java.util.HashMap;
public class Etablissement {
    private String nomCommercial;
    private String adresse;
    private HashMap<Integer, Terrasse> terrasses;

    public Etablissement(String nomCommercial, String adresse) {
        this.nomCommercial = nomCommercial;
        this.adresse = adresse;
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
}
