public class MoralPerson extends Person {
    String formeJu; //Forme juridique
    String codeSiret; //Code siret de l'entreprise

    public MoralPerson(String nom, Account myAccount, String formeJu, String codeSiret){
        super(nom, myAccount);

        this.formeJu = formeJu;
        this.codeSiret = codeSiret;
    }

    public String getFormeJu() {
        return formeJu;
    }

    public String getCodeSiret() {
        return codeSiret;
    }

    public void setFormeJu(String formeJu) {
        this.formeJu = formeJu;
    }

    public void setCodeSiret(String codeSiret) {
        this.codeSiret = codeSiret;
    }

    @Override
    public String toString() {
        return "MoralPerson{" +
                "formeJu='" + formeJu + '\'' +
                ", codeSiret='" + codeSiret + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
