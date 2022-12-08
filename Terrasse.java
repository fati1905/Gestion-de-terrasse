import java.util.ArrayList;
import java.util.Date;

public class Terrasse {
    private int code;
    private int surface;
    private Date date;
    private ArrayList<TypeTerrasse> listeTerrasse;

    public Terrasse(int code, int surface, Date date) {
        this.code = code;
        this.surface = surface;
        this.date = date;
        listeTerrasse = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public int getSurface() {
        return surface;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<TypeTerrasse> getType() {
        return listeTerrasse;
    }

    //le code est unique, définit au début et ne devrait pas être modifié

    public void setSurface(int surface) {
        if (surface > 0)
            this.surface = surface;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void ajouterTerrasse(typeDeTerrasse type, Date dateDebut, Date dateFin) {
        listeTerrasse.add(new TypeTerrasse(type, dateDebut, dateFin));
    }

    public void retirerTerrasse(TypeTerrasse terrasse) {
        if (terrasse != null)
            listeTerrasse.remove(terrasse);
    }

    public String toString() {
        return "(" + code + ") " + surface + "m2, date : " + date + " -> " + listeTerrasse;
    }
}
