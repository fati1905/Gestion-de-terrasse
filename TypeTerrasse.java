enum typeDeTerrasse {
    PERMANENTE,
    TEMPORAIRE,
}

public class TypeTerrasse {
    private typeDeTerrasse typeTerrasse;
    private int dateDebut;
    private int dateFin;
    
    public TypeTerrasse(typeDeTerrasse typeTerrasse, int dateDebut, int dateFin) {
        this.typeTerrasse = typeTerrasse;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public typeDeTerrasse getTypeTerrasse() {
        return typeTerrasse;
    }

    public int getDateDebut() {
        return dateDebut;
    }

    public int getDateFin() {
        return dateFin;
    }

    public void setTypeTerrasse(typeDeTerrasse typeTerrasse) {
        this.typeTerrasse = typeTerrasse;
    }

    // pas besoin de modifier le début de la terrasse normalement par contre la fin si le proprio veut faire arrêter le contrat plus tôt cela doit être possible
    
    public void setDateFin(int dateFin) {
        if (dateFin > dateDebut) 
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

