import java.util.EmptyStackException;
import java.util.HashMap;

public class Etablissement {
    private int identifiant;
    private String nomCommercial;
    private String adresse;
    private HashMap<Integer, Terrasse> terrasses;
    private HashMap<Integer, Zone> zones;

    public Etablissement(int identifiant, String nomCommercial, String adresse) {
        this.identifiant = identifiant;
        this.nomCommercial = nomCommercial;
        this.adresse = adresse;
        terrasses = new HashMap<>();
        zones = new HashMap<>();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNomCommercial(String nomCommercial) {
        if (nomCommercial != null && nomCommercial.length() > 0);
            this.nomCommercial = nomCommercial;
    }

    public void ajouterTerrasse(Terrasse terrasse) {
        if (terrasse != null)
            terrasses.put(terrasse.getCode(), terrasse);
    }

    public void ajouterZone(Zone zone) {
        if (zone != null)
            zones.put(zone.getTypeTerrasses().hashCode(), zone);
    }

    public void retirerTerrasse(Terrasse terrasse) {
        if (terrasse != null && terrasses.size() > 0)
            try {
                terrasses.remove(terrasse.getCode());
            } catch (EmptyStackException ese) {
                System.err.println(ese.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
    }

    public void retirerZone(Zone zone) {
        if (zone != null && zones.size() > 0)
            try {
                zones.remove(zone.getTypeTerrasses().hashCode());
            } catch (EmptyStackException ese) {
                System.err.println(ese.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
    }
}
