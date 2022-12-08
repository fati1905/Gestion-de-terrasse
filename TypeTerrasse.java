import java.util.Date;

enum typeDeTerrasse {
    PERMANENTE,
    TEMPORAIRE,
}

public class TypeTerrasse {
    private typeDeTerrasse typeTerrasse;
    private Date dateDebut;
    private Date dateFin;
    
    public TypeTerrasse(typeDeTerrasse typeTerrasse, Date dateDebut, Date dateFin) {
        this.typeTerrasse = typeTerrasse;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public typeDeTerrasse getTypeTerrasse() {
        return typeTerrasse;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setTypeTerrasse(typeDeTerrasse typeTerrasse) {
        this.typeTerrasse = typeTerrasse;
    }

    // pas besoin de modifier le début de la terrasse normalement par contre la fin si le proprio veut faire arrêter le contrat plus tôt cela doit être possible
    
    public void setDateFin(Date dateFin) {
        if (dateFin.after(dateDebut)) 
            this.dateFin = dateFin;
    }

    private String typeDeTerrasseToString() {
        switch(typeTerrasse) {
            case PERMANENTE:
                return "Permanente";
            case TEMPORAIRE:
                return "Temporaire";
            default:
                return null;
        }
    }

    public String toString() {
        return typeDeTerrasseToString() + " : " + dateDebut + " a " + dateFin;
    }
}

