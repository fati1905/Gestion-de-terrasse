public class Tarif {
    private float prix;

    public Tarif(float prix) {
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix >= 0)
            this.prix = prix;
    }

    public String toString() {
        return prix + "€";
    }
}
