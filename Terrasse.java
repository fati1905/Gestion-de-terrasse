import java.util.ArrayList;

public class Terrasse {
    private int code;
    private int surface;
    private int date;
    private ArrayList<TypeTerrasse> listeTerrasse;

    public Terrasse(int code, int surface, int date) {
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

    public int getDate() {
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

    public void setDate(int date) {
        this.date = date;
    }

    public void ajouterTerrasse(typeDeTerrasse type, int dateDebut, int dateFin) {
        listeTerrasse.add(new TypeTerrasse(type, dateDebut, dateFin));
    }

    public void retirerTerrasse(TypeTerrasse terrasse) {
        listeTerrasse.remove(terrasse);
    }

    public String toString() {
        return "(" + code + ") " + surface + "m2, date : " + date + " -> " + listeTerrasse;
    }
}
