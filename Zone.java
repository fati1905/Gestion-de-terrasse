import java.util.EmptyStackException;
import java.util.HashMap;

public class Zone {
    private HashMap<Integer, TypeTerrasse> typeTerrasse;

    public Zone() {
        typeTerrasse = new HashMap<>();
    }

    public HashMap<Integer, TypeTerrasse> getTypeTerrasses() {
        return typeTerrasse;
    }

    public void ajouterTypeTerrasse(TypeTerrasse typeTerrasse) {
        if (typeTerrasse != null)
            this.typeTerrasse.put(typeTerrasse.getDateDebut().hashCode() + typeTerrasse.getDateFin().hashCode(), typeTerrasse);
    }

    public void retirerTypeTerrasse(TypeTerrasse typeTerrasse) {
        try {
            this.typeTerrasse.remove(typeTerrasse.getDateDebut().hashCode() + typeTerrasse.getDateFin().hashCode());
        } catch (EmptyStackException ese) {
            System.err.println(ese.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
